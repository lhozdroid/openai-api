#!/bin/bash

# Variables
OPENAPI_YAML_URL="https://github.com/openai/openai-openapi/raw/master/openapi.yaml"
OPENAPI_YAML_FILE="openapi.yaml"
OUTPUT_DIR="./"
PACKAGE_NAME="com.openai.openapi"
GENERATOR_CLI_JAR="openapi-generator-cli.jar"

# Maven metadata
GROUP_ID="com.openai"
ARTIFACT_ID="openai-client"
ARTIFACT_VERSION="1.0.0"
PROJECT_NAME="OpenAI Java Client"

# Function to check and download OpenAPI Generator CLI if not present
download_generator_cli() {
    if [ -f "$GENERATOR_CLI_JAR" ]; then
        echo "OpenAPI Generator CLI already downloaded."
    else
        echo "Downloading OpenAPI Generator CLI..."
        wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.10.0/openapi-generator-cli-7.10.0.jar -O "$GENERATOR_CLI_JAR"
        if [ $? -ne 0 ]; then
            echo "Failed to download OpenAPI Generator CLI."
            exit 1
        fi
    fi
}

# Function to check and download the OpenAPI YAML file if not present
download_openapi_yaml() {
    if [ -f "$OPENAPI_YAML_FILE" ]; then
        echo "OpenAPI YAML file already downloaded."
    else
        echo "Downloading OpenAPI YAML file..."
        wget -O "$OPENAPI_YAML_FILE" "$OPENAPI_YAML_URL"
        if [ $? -ne 0 ]; then
            echo "Failed to download OpenAPI YAML file."
            exit 1
        fi
    fi
}

# Function to generate Java client code
generate_java_client() {
    echo "Generating Java client code (skipping validation)..."
    java -jar "$GENERATOR_CLI_JAR" generate \
        -i "$OPENAPI_YAML_FILE" \
        -g java \
        -o "$OUTPUT_DIR" \
        --additional-properties=apiPackage="$PACKAGE_NAME",modelPackage="$PACKAGE_NAME.model",groupId="$GROUP_ID",artifactId="$ARTIFACT_ID",artifactVersion="$ARTIFACT_VERSION",projectName="$PROJECT_NAME" \
        --enable-post-process-file \
        --skip-validate-spec \
        --library apache-httpclient
    if [ $? -ne 0 ]; then
        echo "Failed to generate Java client code."
        exit 1
    fi
}

# Main script execution
download_generator_cli
download_openapi_yaml
generate_java_client

echo "Java client code has been successfully generated."

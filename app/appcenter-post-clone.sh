#!/bin/sh

BUILD_SRC_ROOT=$APPCENTER_SOURCE_DIRECTORY
KEYSTORE_FILENAME="99minutos"

# Create .certs directory under the source root if doesn't exist
[ -d "$BUILD_SRC_ROOT/.certs" ] || mkdir -p "$BUILD_SRC_ROOT/app/.certs"

echo "Este es un mensaje de prueba"

echo "$BUILD_SRC_ROOT/.certs"
# Decode the base64-encoded certificate contexts to the files
echo "$JKS_BASE_64" | base64 --decode > "$BUILD_SRC_ROOT/app/.certs/$KEYSTORE_FILENAME.jks"
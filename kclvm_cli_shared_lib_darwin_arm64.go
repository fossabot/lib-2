package lib

import (
	_ "embed"
)

//go:embed lib/darwin-arm64/libkclvm_cli_cdylib.dylib
var kclvmCliLib []byte

//go:embed lib/darwin-arm64/kclvm_cli
var kclvmCliBin []byte

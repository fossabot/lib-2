package kclvm_artifact

func installLib(libDir, libName string, versionMatched bool) error {
	libFullName := libName + ".dll"
	exportLibFullName := libName + ".lib"
	err := writeLib(libDir, libFullName, kclvmCliLib)
	if err != nil {
		return err
	}
	return writeLib(libDir, exportLibFullName, kclvmExportLib, versionMatched)
}

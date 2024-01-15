package com.kcl.ast;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

// ImportStmt class equivalent in Java
@JsonTypeName("Import")
public class ImportStmt extends Stmt {
    @JsonProperty("path")
    private Node<String> path;

    @JsonProperty("rawpath")
    private String rawpath;

    @JsonProperty("name")
    private String name;

    @JsonProperty("asname")
    private Node<String> asname;

    @JsonProperty("pkg_name")
    private String pkgName;

	public Node<String> getPath() {
		return path;
	}

	public void setPath(Node<String> path) {
		this.path = path;
	}

	public String getRawpath() {
		return rawpath;
	}

	public void setRawpath(String rawpath) {
		this.rawpath = rawpath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node<String> getAsname() {
		return asname;
	}

	public void setAsname(Node<String> asname) {
		this.asname = asname;
	}

	public String getPkgName() {
		return pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}

    // Constructor, getters, and setters...
}
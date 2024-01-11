package com.kcl.ast;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

// CallExpr class equivalent in Java
@JsonTypeName("Call")
public class CallExpr extends Expr {
    @JsonProperty("func")
    private NodeRef<Expr> func;

    @JsonProperty("args")
    private List<NodeRef<Expr>> args;

    @JsonProperty("keywords")
    private List<NodeRef<Keyword>> keywords;

	public NodeRef<Expr> getFunc() {
		return func;
	}

	public void setFunc(NodeRef<Expr> func) {
		this.func = func;
	}

	public List<NodeRef<Expr>> getArgs() {
		return args;
	}

	public void setArgs(List<NodeRef<Expr>> args) {
		this.args = args;
	}

	public List<NodeRef<Keyword>> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<NodeRef<Keyword>> keywords) {
		this.keywords = keywords;
	}

    // Constructor, getters, and setters...
}

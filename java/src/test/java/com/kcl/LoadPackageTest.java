package com.kcl;

import org.junit.Test;

import com.kcl.api.API;
import com.kcl.api.Spec.LoadPackage_Args;
import com.kcl.api.Spec.LoadPackage_Result;
import com.kcl.api.Spec.ParseProgram_Args;
import com.kcl.ast.Program;
import com.kcl.util.JsonUtil;

public class LoadPackageTest {
    @Test
    public void testProgramSymbols() throws Exception {
        API api = new API();
        LoadPackage_Result result = api.loadPackage(
                LoadPackage_Args.newBuilder().setResolveAst(true).setParseArgs(
                        ParseProgram_Args.newBuilder().addPaths("./src/test_data/schema.k").build())
                        .build());
        String programString = result.getProgram();
        Program program = JsonUtil.deserializeProgram(programString);
        System.out.println(program.getRoot());
        result.getSymbolsMap().values().forEach(s -> System.out.println(s));
    }
}
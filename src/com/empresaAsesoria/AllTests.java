package com.empresaAsesoria;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestContenedor.class, TestUsuario.class })
public class AllTests {

}

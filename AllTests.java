package com.verizon;

import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculatorsTest.class, CalculatorsTestTest.class, CalculatorTest2.class })
public class AllTests {

}

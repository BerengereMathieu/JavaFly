package javafly.mosaic.action;

import java.util.function.Function;

import javafly.mosaic.environment.Environment;
/**
 * The common interface for the possible actions of the agents. Only used for
 * type consistency
 * 
 * @author berengere
 *
 */
public interface Action extends Function<Environment, Environment> {
}

package com.sjms.wq.行为型.解释器模式.template.shared;

/**
 * Specificaiton interface.
 * 这个就是典型的解码器  可以使用在业务中
 */
public interface Specification<T> {

  /**
   * Check if {@code t} is satisfied by the specification.
   *
   * @param t Object to test.
   * @return {@code true} if {@code t} satisfies the specification.
   */
  boolean isSatisfiedBy(T t);
  /**
   * Create a new specification that is the AND operation of {@code this} specification and another specification.
   * @param specification Specification to AND.
   * @return A new specification.
   */
  Specification<T> and(Specification<T> specification);

  /**
   * Create a new specification that is the OR operation of {@code this} specification and another specification.
   * @param specification Specification to OR.
   * @return A new specification.
   */
  Specification<T> or(Specification<T> specification);

  /**
   * Create a new specification that is the NOT operation of {@code this} specification.
   * @param specification Specification to NOT.
   * @return A new specification.
   */
  Specification<T> not(Specification<T> specification);
}

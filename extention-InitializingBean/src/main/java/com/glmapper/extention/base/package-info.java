/**
 * @description: [描述文本]
 * @email: <a href="glmapper_2018@163.com"></a>
 * @author: glmapper
 * @date: 18/7/22
 */
package com.glmapper.extention.base;

/**
 * 本包下包括两个base demo，主要用于描述两种初始化bean的方式。
 * 1、通过实现InitializingBean接口，在afterPropertiesSet中完成一些具体逻辑初始化工作。
 * 2、通过bean 配置 init-method的方式，指定初始化的方法完成一些具体逻辑初始化工作。
 *
 *
 * 1、InitializingBean接口、Disposable接口可以和init-method、destory-method配合使用，接口执行顺序优先于配置
 *
 * 2、InitializingBean接口、Disposable接口底层使用类型强转.方法名()进行直接方法调用，
 *    init-method、destory-method底层使用反射，前者和Spring耦合程度更高但效率高，后者解除了和Spring之间的耦合但是效率低，使用哪个看个人喜好
 *
 * 3、afterPropertiesSet()方法是在Bean的属性设置之后才会进行调用，
 * 个Bean的afterPropertiesSet()方法执行完毕才会执行下一个Bean的afterPropertiesSet()方法，
 * 因此不建议在afterPropertiesSet()方法中写处理时间太长的方法
 *
 *
 * */

package com.github.longhaoteng.core.common;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * BeanConverter
 *
 * @author mr.long
 */
public class BeanConverter {

    // mapper
    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    /**
     * map
     *
     * @param entity      entity
     * @param targetClass target class
     * @param <S>         source type
     * @param <T>         entity type
     * @return result
     */
    public static <S, T> T map(S entity, Class<T> targetClass) {
        return entity == null ? null : mapper.map(entity, targetClass);
    }

    /**
     * map
     *
     * @param sourceList  source list
     * @param targetClass target class
     * @param <S>         source type
     * @param <T>         target type
     * @return result
     */
    public static <S, T> List<T> map(List<S> sourceList, Class<T> targetClass) {
        List<T> result = new ArrayList<>();
        for (S source : sourceList) {
            result.add(map(source, targetClass));
        }
        return result;
    }

    /**
     * map
     *
     * @param sourceList  source list
     * @param targetClass target class
     * @param <S>         source type
     * @param <T>         target type
     * @return result
     */
    public static <S, T> Set<T> map(Set<S> sourceList, Class<T> targetClass) {
        Set<T> result = new HashSet<>();
        for (S source : sourceList) {
            result.add(map(source, targetClass));
        }
        return result;
    }
}

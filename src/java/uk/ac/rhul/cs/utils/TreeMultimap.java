package uk.ac.rhul.cs.utils;

import java.util.List;
import java.util.TreeMap;

/**
 * Implementation of a multimap backed by a {@link TreeMap}.
 * 
 * @author tamas
 *
 * @param <K> the type for the keys
 * @param <V> the type for the values
 */
public class TreeMultimap<K, V> extends MultimapBase<K, V> {
	protected void initializeStorage() {
		data = new TreeMap<K, List<V>>();
	}
}

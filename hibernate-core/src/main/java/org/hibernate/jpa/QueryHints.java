/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.jpa;

import java.util.HashSet;
import java.util.Set;

/**
 * List of all supported hints that may be passed to {@link jakarta.persistence.Query#setHint(String, Object)}.
 *
 * @see SpecHints
 * @see HibernateHints
 */
public class QueryHints {
	/**
	 * @see SpecHints#HINT_QUERY_TIMEOUT
	 */
	public static final String JAKARTA_SPEC_HINT_TIMEOUT = SpecHints.HINT_QUERY_TIMEOUT;

	/**
	 * @see HibernateHints#HINT_COMMENT
	 */
	public static final String HINT_COMMENT = HibernateHints.HINT_COMMENT;

	/**
	 * @see HibernateHints#HINT_FETCH_SIZE
	 */
	public static final String HINT_FETCH_SIZE = HibernateHints.HINT_FETCH_SIZE;

	/**
	 * @see HibernateHints#HINT_CACHEABLE
	 */
	public static final String HINT_CACHEABLE = HibernateHints.HINT_CACHEABLE;

	/**
	 * @see HibernateHints#HINT_CACHE_REGION
	 */
	public static final String HINT_CACHE_REGION = HibernateHints.HINT_CACHE_REGION;

	/**
	 * @see HibernateHints#HINT_CACHE_MODE
	 */
	public static final String HINT_CACHE_MODE = HibernateHints.HINT_CACHE_MODE;

	/**
	 * @see HibernateHints#HINT_READ_ONLY
	 */
	public static final String HINT_READONLY = HibernateHints.HINT_READ_ONLY;

	/**
	 * @see HibernateHints#HINT_FLUSH_MODE
	 */
	public static final String HINT_FLUSH_MODE = HibernateHints.HINT_FLUSH_MODE;

	/**
	 * @see HibernateHints#HINT_NATIVE_LOCK_MODE
	 */
	public static final String HINT_NATIVE_LOCKMODE = HibernateHints.HINT_NATIVE_LOCK_MODE;

	/**
	 * @see SpecHints#HINT_FETCH_GRAPH
	 */
	public static final String JAKARTA_HINT_FETCH_GRAPH = SpecHints.HINT_FETCH_GRAPH;

	/**
	 * @see SpecHints#HINT_LOAD_GRAPH
	 */
	public static final String JAKARTA_HINT_FETCHGRAPH = SpecHints.HINT_FETCH_GRAPH;

	/**
	 * @see SpecHints#HINT_LOAD_GRAPH
	 */
	public static final String JAKARTA_HINT_LOAD_GRAPH = SpecHints.HINT_LOAD_GRAPH;

	/**
	 * @see SpecHints#HINT_LOAD_GRAPH
	 */
	public static final String JAKARTA_HINT_LOADGRAPH = SpecHints.HINT_LOAD_GRAPH;

	/**
	 * @see HibernateHints#HINT_FOLLOW_ON_LOCKING
	 */
	public static final String HINT_FOLLOW_ON_LOCKING = HibernateHints.HINT_FOLLOW_ON_LOCKING;

	/**
	 * @see HibernateHints#HINT_NATIVE_SPACES
	 */
	public static final String HINT_NATIVE_SPACES = HibernateHints.HINT_NATIVE_SPACES;

	/**
	 * @see LegacySpecHints#HINT_JAVAEE_FETCH_GRAPH
	 */
	public static final String HINT_FETCHGRAPH = LegacySpecHints.HINT_JAVAEE_FETCH_GRAPH;

	/**
	 * @see LegacySpecHints#HINT_JAVAEE_LOAD_GRAPH
	 */
	public static final String HINT_LOADGRAPH = LegacySpecHints.HINT_JAVAEE_LOAD_GRAPH;

	/**
	 * The hint key for specifying a query timeout per Hibernate O/RM, which defines the timeout in seconds.
	 *
	 * @deprecated use {@link #SPEC_HINT_TIMEOUT} instead
	 */
	@Deprecated
	public static final String HINT_TIMEOUT = HibernateHints.HINT_TIMEOUT;

	/**
	 * @see LegacySpecHints#HINT_JAVAEE_QUERY_TIMEOUT
	 *
	 * @deprecated use {@link SpecHints#HINT_QUERY_TIMEOUT} instead
	 */
	@Deprecated
	public static final String SPEC_HINT_TIMEOUT = LegacySpecHints.HINT_JAVAEE_QUERY_TIMEOUT;


	private static final Set<String> HINTS = buildHintsSet();

	private static Set<String> buildHintsSet() {
		final HashSet<String> hints = new HashSet<>();

		hints.add( HibernateHints.HINT_TIMEOUT );
		hints.add( HibernateHints.HINT_READ_ONLY );
		hints.add( HibernateHints.HINT_FLUSH_MODE );
		hints.add( HibernateHints.HINT_CACHEABLE );
		hints.add( HibernateHints.HINT_CACHE_MODE );
		hints.add( HibernateHints.HINT_CACHE_REGION );
		hints.add( HibernateHints.HINT_FETCH_SIZE );
		hints.add( HibernateHints.HINT_COMMENT );
		hints.add( HibernateHints.HINT_NATIVE_SPACES );
		hints.add( HibernateHints.HINT_NATIVE_LOCK_MODE );

		hints.add( SpecHints.HINT_QUERY_TIMEOUT );
		hints.add( SpecHints.HINT_FETCH_GRAPH );
		hints.add( SpecHints.HINT_LOAD_GRAPH );

		hints.add( LegacySpecHints.HINT_JAVAEE_QUERY_TIMEOUT );
		hints.add( LegacySpecHints.HINT_JAVAEE_FETCH_GRAPH );
		hints.add( LegacySpecHints.HINT_JAVAEE_LOAD_GRAPH );

		return java.util.Collections.unmodifiableSet( hints );
	}

	public static Set<String> getDefinedHints() {
		return HINTS;
	}

	protected QueryHints() {
	}
}

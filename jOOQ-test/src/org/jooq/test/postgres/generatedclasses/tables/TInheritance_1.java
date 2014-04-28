/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritance_1 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1Record> {

	private static final long serialVersionUID = 175227874;

	/**
	 * The singleton instance of <code>public.t_inheritance_1</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TInheritance_1 T_INHERITANCE_1 = new org.jooq.test.postgres.generatedclasses.tables.TInheritance_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1Record.class;
	}

	/**
	 * The column <code>public.t_inheritance_1.text_1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1Record, java.lang.String> TEXT_1 = createField("text_1", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Create a <code>public.t_inheritance_1</code> table reference
	 */
	public TInheritance_1() {
		super("t_inheritance_1", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_inheritance_1</code> table reference
	 */
	public TInheritance_1(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TInheritance_1.T_INHERITANCE_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TInheritance_1 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TInheritance_1(alias);
	}
}

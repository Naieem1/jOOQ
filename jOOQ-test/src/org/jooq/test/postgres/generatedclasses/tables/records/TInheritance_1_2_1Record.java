/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritance_1_2_1Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_2_1Record> implements org.jooq.Record3<java.lang.String, java.lang.String, java.lang.String>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITInheritance_1_2_1 {

	private static final long serialVersionUID = 759194717;

	/**
	 * Setter for <code>public.t_inheritance_1_2_1.text_1</code>.
	 */
	public TInheritance_1_2_1Record setText_1(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_1_2_1.text_1</code>.
	 */
	@Override
	public java.lang.String getText_1() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_inheritance_1_2_1.text_1_2</code>.
	 */
	public TInheritance_1_2_1Record setText_1_2(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_1_2_1.text_1_2</code>.
	 */
	@Override
	public java.lang.String getText_1_2() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.t_inheritance_1_2_1.text_1_2_1</code>.
	 */
	public TInheritance_1_2_1Record setText_1_2_1(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_1_2_1.text_1_2_1</code>.
	 */
	@Override
	public java.lang.String getText_1_2_1() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1.TEXT_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1.TEXT_1_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1.TEXT_1_2_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getText_1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getText_1_2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getText_1_2_1();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInheritance_1_2_1Record
	 */
	public TInheritance_1_2_1Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1);
	}

	/**
	 * Create a detached, initialised TInheritance_1_2_1Record
	 */
	public TInheritance_1_2_1Record(java.lang.String text_1, java.lang.String text_1_2, java.lang.String text_1_2_1) {
		super(org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1);

		setValue(0, text_1);
		setValue(1, text_1_2);
		setValue(2, text_1_2_1);
	}
}

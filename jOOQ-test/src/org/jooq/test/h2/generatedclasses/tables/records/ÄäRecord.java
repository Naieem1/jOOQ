/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ÄäRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.ÄäRecord> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä {

	private static final long serialVersionUID = -1949734643;

	/**
	 * Setter for <code>PUBLIC.Ää.Öö</code>.
	 */
	@Override
	public void setÖö(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.Ää.Öö</code>.
	 */
	@Override
	public java.lang.Integer getÖö() {
		return (java.lang.Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.Ää.ÖÖ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getÖö();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä from) {
		setÖö(from.getÖö());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ÄäRecord
	 */
	public ÄäRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.Ää.ÄÄ);
	}

	/**
	 * Create a detached, initialised ÄäRecord
	 */
	public ÄäRecord(java.lang.Integer öö) {
		super(org.jooq.test.h2.generatedclasses.tables.Ää.ÄÄ);

		setValue(0, öö);
	}
}

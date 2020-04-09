// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class MxObjectEnum extends mxmodelreflection.proxies.MxObjectMember
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.MxObjectEnum";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AttributeName("AttributeName"),
		AttributeType("AttributeType"),
		AttributeTypeEnum("AttributeTypeEnum"),
		CompleteName("CompleteName"),
		DescriptiveName("DescriptiveName"),
		FieldLength("FieldLength"),
		IsVirtual("IsVirtual"),
		Values("MxModelReflection.Values"),
		MxObjectMember_MxObjectType("MxModelReflection.MxObjectMember_MxObjectType"),
		MxObjectMember_Type("MxModelReflection.MxObjectMember_Type");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxObjectEnum(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.MxObjectEnum"));
	}

	protected MxObjectEnum(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxObjectEnumMendixObject)
	{
		super(context, mxObjectEnumMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.MxObjectEnum", mxObjectEnumMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.MxObjectEnum");
	}

	/**
	 * @deprecated Use 'MxObjectEnum.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.MxObjectEnum initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.MxObjectEnum.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectEnum initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectEnum(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectEnum load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectEnum.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectEnum> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnum> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnum>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectEnum" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectEnum.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Values
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> getValues() throws com.mendix.core.CoreException
	{
		return getValues(getContext());
	}

	/**
	 * @param context
	 * @return value of Values
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> getValues(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectEnumValue>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Values.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectEnumValue.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Values
	 * @param values
	 */
	public final void setValues(java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> values)
	{
		setValues(getContext(), values);
	}

	/**
	 * Set value of Values
	 * @param context
	 * @param values
	 */
	public final void setValues(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.MxObjectEnumValue> values)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectEnumValue proxyObject : values)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Values.toString(), identifiers);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.MxObjectEnum that = (mxmodelreflection.proxies.MxObjectEnum) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MxModelReflection.MxObjectEnum";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

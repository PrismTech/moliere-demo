package dds.demo.vehicle;


/**
* dds/demo/vehicle/VehicleRegionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/vehicle.idl
* Monday, January 12, 2015 5:31:24 PM CET
*/

abstract public class VehicleRegionHelper
{
  private static String  _id = "IDL:dds/demo/vehicle/VehicleRegion:1.0";

  public static void insert (org.omg.CORBA.Any a, dds.demo.vehicle.VehicleRegion that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static dds.demo.vehicle.VehicleRegion extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "vid",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "x",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "y",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[3] = new org.omg.CORBA.StructMember (
            "width",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[4] = new org.omg.CORBA.StructMember (
            "height",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (dds.demo.vehicle.VehicleRegionHelper.id (), "VehicleRegion", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static dds.demo.vehicle.VehicleRegion read (org.omg.CORBA.portable.InputStream istream)
  {
    dds.demo.vehicle.VehicleRegion value = new dds.demo.vehicle.VehicleRegion ();
    value.vid = istream.read_long ();
    value.x = istream.read_long ();
    value.y = istream.read_long ();
    value.width = istream.read_long ();
    value.height = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, dds.demo.vehicle.VehicleRegion value)
  {
    ostream.write_long (value.vid);
    ostream.write_long (value.x);
    ostream.write_long (value.y);
    ostream.write_long (value.width);
    ostream.write_long (value.height);
  }

}

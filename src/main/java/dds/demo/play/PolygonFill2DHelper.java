package dds.demo.play;


/**
* dds/demo/play/PolygonFill2DHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/ddsplay.idl
* Monday, January 12, 2015 5:31:22 PM CET
*/

abstract public class PolygonFill2DHelper
{
  private static String  _id = "IDL:dds/demo/play/PolygonFill2D:1.0";

  public static void insert (org.omg.CORBA.Any a, dds.demo.play.PolygonFill2D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static dds.demo.play.PolygonFill2D extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "sid",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = dds.demo.play.Coord2DHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (dds.demo.play.Coord2DListHelper.id (), "Coord2DList", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "coordList",
            _tcOf_members0,
            null);
          _tcOf_members0 = dds.demo.play.ColorRGBHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "borderColor",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (dds.demo.play.PolygonFill2DHelper.id (), "PolygonFill2D", _members0);
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

  public static dds.demo.play.PolygonFill2D read (org.omg.CORBA.portable.InputStream istream)
  {
    dds.demo.play.PolygonFill2D value = new dds.demo.play.PolygonFill2D ();
    value.sid = istream.read_long ();
    value.id = istream.read_long ();
    value.coordList = dds.demo.play.Coord2DListHelper.read (istream);
    value.borderColor = dds.demo.play.ColorRGBHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, dds.demo.play.PolygonFill2D value)
  {
    ostream.write_long (value.sid);
    ostream.write_long (value.id);
    dds.demo.play.Coord2DListHelper.write (ostream, value.coordList);
    dds.demo.play.ColorRGBHelper.write (ostream, value.borderColor);
  }

}

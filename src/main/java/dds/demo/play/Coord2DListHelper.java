package dds.demo.play;


/**
* dds/demo/play/Coord2DListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/ddsplay.idl
* Monday, January 12, 2015 5:31:22 PM CET
*/

abstract public class Coord2DListHelper
{
  private static String  _id = "IDL:dds/demo/play/Coord2DList:1.0";

  public static void insert (org.omg.CORBA.Any a, dds.demo.play.Coord2D[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static dds.demo.play.Coord2D[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = dds.demo.play.Coord2DHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (dds.demo.play.Coord2DListHelper.id (), "Coord2DList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static dds.demo.play.Coord2D[] read (org.omg.CORBA.portable.InputStream istream)
  {
    dds.demo.play.Coord2D value[] = null;
    int _len0 = istream.read_long ();
    value = new dds.demo.play.Coord2D[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = dds.demo.play.Coord2DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, dds.demo.play.Coord2D[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      dds.demo.play.Coord2DHelper.write (ostream, value[_i0]);
  }

}

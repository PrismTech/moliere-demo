package dds.demo.play;


/**
* dds/demo/play/Polygon2D.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/ddsplay.idl
* Monday, January 12, 2015 5:31:22 PM CET
*/

/**
* Updated by idl2j
* from ../idl/ddsplay.idl
* Monday, January 12, 2015 5:31:23 PM CET
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "Polygon2D",
    keys = {"sid", "id"}
)
public final class Polygon2D implements org.omg.CORBA.portable.IDLEntity
{
  public int sid = (int)0;
  public int id = (int)0;
  public dds.demo.play.Coord2D coordList[] = null;
  public dds.demo.play.ColorRGB borderColor = null;

  public Polygon2D ()
  {
  } // ctor

  public Polygon2D (int _sid, int _id, dds.demo.play.Coord2D[] _coordList, dds.demo.play.ColorRGB _borderColor)
  {
    sid = _sid;
    id = _id;
    coordList = _coordList;
    borderColor = _borderColor;
  } // ctor

} // class Polygon2D

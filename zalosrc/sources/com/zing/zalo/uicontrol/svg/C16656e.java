package com.zing.zalo.uicontrol.svg;

import android.graphics.Matrix;
import com.adtima.Adtima;
import com.zing.zalo.uicontrol.svg.C16652a;
import com.zing.zalo.uicontrol.svg.C16653b;
import com.zing.zalo.uicontrol.svg.C16654c;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dd0.C17888a;
import dd0.C17889b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* renamed from: com.zing.zalo.uicontrol.svg.e */
/* loaded from: classes4.dex */
public class C16656e extends DefaultHandler2 {

    /* renamed from: d */
    private int f84287d;

    /* renamed from: a */
    private C16654c f84284a = null;

    /* renamed from: b */
    private C16654c.j0 f84285b = null;

    /* renamed from: c */
    private boolean f84286c = false;

    /* renamed from: e */
    private boolean f84288e = false;

    /* renamed from: f */
    private g f84289f = null;

    /* renamed from: g */
    private StringBuilder f84290g = null;

    /* renamed from: h */
    private boolean f84291h = false;

    /* renamed from: i */
    private StringBuilder f84292i = null;

    /* renamed from: j */
    private Set f84293j = null;

    /* renamed from: com.zing.zalo.uicontrol.svg.e$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84294a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84295b;

        static {
            int[] iArr = new int[f.values().length];
            f84295b = iArr;
            try {
                iArr[f.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84295b[f.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84295b[f.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84295b[f.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84295b[f.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84295b[f.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84295b[f.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84295b[f.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84295b[f.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84295b[f.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84295b[f.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f84295b[f.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f84295b[f.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f84295b[f.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f84295b[f.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f84295b[f.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f84295b[f.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f84295b[f.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f84295b[f.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f84295b[f.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f84295b[f.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f84295b[f.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f84295b[f.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f84295b[f.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f84295b[f.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f84295b[f.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f84295b[f.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f84295b[f.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f84295b[f.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f84295b[f.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f84295b[f.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f84295b[f.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f84295b[f.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f84295b[f.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f84295b[f.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f84295b[f.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f84295b[f.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f84295b[f.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f84295b[f.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f84295b[f.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f84295b[f.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f84295b[f.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f84295b[f.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f84295b[f.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f84295b[f.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f84295b[f.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f84295b[f.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f84295b[f.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f84295b[f.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f84295b[f.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f84295b[f.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f84295b[f.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f84295b[f.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f84295b[f.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f84295b[f.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f84295b[f.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f84295b[f.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f84295b[f.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f84295b[f.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f84295b[f.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f84295b[f.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f84295b[f.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f84295b[f.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f84295b[f.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f84295b[f.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f84295b[f.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f84295b[f.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f84295b[f.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f84295b[f.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f84295b[f.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f84295b[f.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f84295b[f.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f84295b[f.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f84295b[f.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f84295b[f.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f84295b[f.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f84295b[f.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f84295b[f.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f84295b[f.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f84295b[f.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f84295b[f.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f84295b[f.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f84295b[f.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f84295b[f.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f84295b[f.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f84295b[f.viewBox.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f84295b[f.type.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f84295b[f.media.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            int[] iArr2 = new int[g.values().length];
            f84294a = iArr2;
            try {
                iArr2[g.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                f84294a[g.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f84294a[g.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f84294a[g.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f84294a[g.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f84294a[g.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f84294a[g.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f84294a[g.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f84294a[g.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f84294a[g.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f84294a[g.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f84294a[g.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f84294a[g.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f84294a[g.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f84294a[g.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f84294a[g.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f84294a[g.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f84294a[g.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f84294a[g.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f84294a[g.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f84294a[g.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f84294a[g.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f84294a[g.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f84294a[g.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f84294a[g.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f84294a[g.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f84294a[g.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f84294a[g.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f84294a[g.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f84294a[g.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f84294a[g.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused119) {
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        private static final Map f84296a;

        static {
            HashMap hashMap = new HashMap(10);
            f84296a = hashMap;
            hashMap.put("none", C16653b.a.None);
            hashMap.put("xMinYMin", C16653b.a.XMinYMin);
            hashMap.put("xMidYMin", C16653b.a.XMidYMin);
            hashMap.put("xMaxYMin", C16653b.a.XMaxYMin);
            hashMap.put("xMinYMid", C16653b.a.XMinYMid);
            hashMap.put("xMidYMid", C16653b.a.XMidYMid);
            hashMap.put("xMaxYMid", C16653b.a.XMaxYMid);
            hashMap.put("xMinYMax", C16653b.a.XMinYMax);
            hashMap.put("xMidYMax", C16653b.a.XMidYMax);
            hashMap.put("xMaxYMax", C16653b.a.XMaxYMax);
        }

        /* renamed from: a */
        public static C16653b.a m88742a(String str) {
            return (C16653b.a) f84296a.get(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        private static final Map f84297a;

        static {
            HashMap hashMap = new HashMap(47);
            f84297a = hashMap;
            hashMap.put("aliceblue", 15792383);
            hashMap.put("antiquewhite", 16444375);
            hashMap.put("aqua", 65535);
            hashMap.put("aquamarine", 8388564);
            hashMap.put("azure", 15794175);
            hashMap.put("beige", 16119260);
            hashMap.put("bisque", 16770244);
            hashMap.put("black", 0);
            hashMap.put("blanchedalmond", 16772045);
            hashMap.put("blue", 255);
            hashMap.put("blueviolet", 9055202);
            hashMap.put("brown", 10824234);
            hashMap.put("burlywood", 14596231);
            hashMap.put("cadetblue", 6266528);
            hashMap.put("chartreuse", 8388352);
            hashMap.put("chocolate", 13789470);
            hashMap.put("coral", 16744272);
            hashMap.put("cornflowerblue", 6591981);
            hashMap.put("cornsilk", 16775388);
            hashMap.put("crimson", 14423100);
            hashMap.put("cyan", 65535);
            hashMap.put("darkblue", 139);
            hashMap.put("darkcyan", 35723);
            hashMap.put("darkgoldenrod", 12092939);
            hashMap.put("darkgray", 11119017);
            hashMap.put("darkgreen", 25600);
            hashMap.put("darkgrey", 11119017);
            hashMap.put("darkkhaki", 12433259);
            hashMap.put("darkmagenta", 9109643);
            hashMap.put("darkolivegreen", 5597999);
            hashMap.put("darkorange", 16747520);
            hashMap.put("darkorchid", 10040012);
            hashMap.put("darkred", 9109504);
            hashMap.put("darksalmon", 15308410);
            hashMap.put("darkseagreen", 9419919);
            hashMap.put("darkslateblue", 4734347);
            hashMap.put("darkslategray", 3100495);
            hashMap.put("darkslategrey", 3100495);
            hashMap.put("darkturquoise", 52945);
            hashMap.put("darkviolet", 9699539);
            hashMap.put("deeppink", 16716947);
            hashMap.put("deepskyblue", 49151);
            hashMap.put("dimgray", 6908265);
            hashMap.put("dimgrey", 6908265);
            hashMap.put("dodgerblue", 2003199);
            hashMap.put("firebrick", 11674146);
            hashMap.put("floralwhite", 16775920);
            hashMap.put("forestgreen", 2263842);
            hashMap.put("fuchsia", 16711935);
            hashMap.put("gainsboro", 14474460);
            hashMap.put("ghostwhite", 16316671);
            hashMap.put("gold", 16766720);
            hashMap.put("goldenrod", 14329120);
            hashMap.put("gray", 8421504);
            hashMap.put("green", 32768);
            hashMap.put("greenyellow", 11403055);
            hashMap.put("grey", 8421504);
            hashMap.put("honeydew", 15794160);
            hashMap.put("hotpink", 16738740);
            hashMap.put("indianred", 13458524);
            hashMap.put("indigo", 4915330);
            hashMap.put("ivory", 16777200);
            hashMap.put("khaki", 15787660);
            hashMap.put("lavender", 15132410);
            hashMap.put("lavenderblush", 16773365);
            hashMap.put("lawngreen", 8190976);
            hashMap.put("lemonchiffon", 16775885);
            hashMap.put("lightblue", 11393254);
            hashMap.put("lightcoral", 15761536);
            hashMap.put("lightcyan", 14745599);
            hashMap.put("lightgoldenrodyellow", 16448210);
            hashMap.put("lightgray", 13882323);
            hashMap.put("lightgreen", 9498256);
            hashMap.put("lightgrey", 13882323);
            hashMap.put("lightpink", 16758465);
            hashMap.put("lightsalmon", 16752762);
            hashMap.put("lightseagreen", 2142890);
            hashMap.put("lightskyblue", 8900346);
            hashMap.put("lightslategray", 7833753);
            hashMap.put("lightslategrey", 7833753);
            hashMap.put("lightsteelblue", 11584734);
            hashMap.put("lightyellow", 16777184);
            hashMap.put("lime", 65280);
            hashMap.put("limegreen", 3329330);
            hashMap.put("linen", 16445670);
            hashMap.put("magenta", 16711935);
            hashMap.put("maroon", 8388608);
            hashMap.put("mediumaquamarine", 6737322);
            hashMap.put("mediumblue", 205);
            hashMap.put("mediumorchid", 12211667);
            hashMap.put("mediumpurple", 9662683);
            hashMap.put("mediumseagreen", 3978097);
            hashMap.put("mediumslateblue", 8087790);
            hashMap.put("mediumspringgreen", 64154);
            hashMap.put("mediumturquoise", 4772300);
            hashMap.put("mediumvioletred", 13047173);
            hashMap.put("midnightblue", 1644912);
            hashMap.put("mintcream", 16121850);
            hashMap.put("mistyrose", 16770273);
            hashMap.put("moccasin", 16770229);
            hashMap.put("navajowhite", 16768685);
            hashMap.put("navy", 128);
            hashMap.put("oldlace", 16643558);
            hashMap.put("olive", 8421376);
            hashMap.put("olivedrab", 7048739);
            hashMap.put("orange", 16753920);
            hashMap.put("orangered", 16729344);
            hashMap.put("orchid", 14315734);
            hashMap.put("palegoldenrod", 15657130);
            hashMap.put("palegreen", 10025880);
            hashMap.put("paleturquoise", 11529966);
            hashMap.put("palevioletred", 14381203);
            hashMap.put("papayawhip", 16773077);
            hashMap.put("peachpuff", 16767673);
            hashMap.put("peru", 13468991);
            hashMap.put("pink", 16761035);
            hashMap.put("plum", 14524637);
            hashMap.put("powderblue", 11591910);
            hashMap.put("purple", 8388736);
            hashMap.put("red", 16711680);
            hashMap.put("rosybrown", 12357519);
            hashMap.put("royalblue", 4286945);
            hashMap.put("saddlebrown", 9127187);
            hashMap.put("salmon", 16416882);
            hashMap.put("sandybrown", 16032864);
            hashMap.put("seagreen", 3050327);
            hashMap.put("seashell", 16774638);
            hashMap.put("sienna", 10506797);
            hashMap.put("silver", 12632256);
            hashMap.put("skyblue", 8900331);
            hashMap.put("slateblue", 6970061);
            hashMap.put("slategray", 7372944);
            hashMap.put("slategrey", 7372944);
            hashMap.put("snow", 16775930);
            hashMap.put("springgreen", 65407);
            hashMap.put("steelblue", 4620980);
            hashMap.put("tan", 13808780);
            hashMap.put("teal", 32896);
            hashMap.put("thistle", 14204888);
            hashMap.put("tomato", 16737095);
            hashMap.put("turquoise", 4251856);
            hashMap.put("violet", 15631086);
            hashMap.put("wheat", 16113331);
            hashMap.put("white", 16777215);
            hashMap.put("whitesmoke", 16119285);
            hashMap.put("yellow", 16776960);
            hashMap.put("yellowgreen", 10145074);
        }

        /* renamed from: a */
        public static Integer m88743a(String str) {
            return (Integer) f84297a.get(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$d */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a */
        private static final Map f84298a;

        static {
            HashMap hashMap = new HashMap(9);
            f84298a = hashMap;
            C16654c.d1 d1Var = C16654c.d1.pt;
            hashMap.put("xx-small", new C16654c.p(0.694f, d1Var));
            hashMap.put("x-small", new C16654c.p(0.833f, d1Var));
            hashMap.put("small", new C16654c.p(10.0f, d1Var));
            hashMap.put("medium", new C16654c.p(12.0f, d1Var));
            hashMap.put("large", new C16654c.p(14.4f, d1Var));
            hashMap.put("x-large", new C16654c.p(17.3f, d1Var));
            hashMap.put("xx-large", new C16654c.p(20.7f, d1Var));
            C16654c.d1 d1Var2 = C16654c.d1.percent;
            hashMap.put("smaller", new C16654c.p(83.33f, d1Var2));
            hashMap.put("larger", new C16654c.p(120.0f, d1Var2));
        }

        /* renamed from: a */
        public static C16654c.p m88744a(String str) {
            return (C16654c.p) f84298a.get(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        private static final Map f84299a;

        static {
            HashMap hashMap = new HashMap(13);
            f84299a = hashMap;
            hashMap.put("normal", 400);
            Integer valueOf = Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
            hashMap.put("bold", valueOf);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", Integer.valueOf(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));
            hashMap.put("600", 600);
            hashMap.put("700", valueOf);
            hashMap.put("800", Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING));
            hashMap.put("900", Integer.valueOf(IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
        }

        /* renamed from: a */
        public static Integer m88745a(String str) {
            return (Integer) f84299a.get(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$f */
    /* loaded from: classes4.dex */
    public enum f {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        id,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* renamed from: d1 */
        private static final Map f84359d1 = new HashMap();

        /* renamed from: c */
        public static f m88747c(String str) {
            Map map = f84359d1;
            f fVar = (f) map.get(str);
            if (fVar != null) {
                return fVar;
            }
            if (str.equals("class")) {
                f fVar2 = CLASS;
                map.put(str, fVar2);
                return fVar2;
            }
            if (str.indexOf(95) != -1) {
                f fVar3 = UNSUPPORTED;
                map.put(str, fVar3);
                return fVar3;
            }
            try {
                f valueOf = valueOf(str.replace('-', '_'));
                if (valueOf != CLASS) {
                    map.put(str, valueOf);
                    return valueOf;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = f84359d1;
            f fVar4 = UNSUPPORTED;
            map2.put(str, fVar4);
            return fVar4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uicontrol.svg.e$g */
    /* loaded from: classes4.dex */
    public enum g {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* renamed from: V */
        private static final Map f84415V = new HashMap();

        /* renamed from: c */
        public static g m88749c(String str) {
            Map map = f84415V;
            g gVar = (g) map.get(str);
            if (gVar != null) {
                return gVar;
            }
            if (str.equals("switch")) {
                g gVar2 = SWITCH;
                map.put(str, gVar2);
                return gVar2;
            }
            try {
                g valueOf = valueOf(str);
                if (valueOf != SWITCH) {
                    map.put(str, valueOf);
                    return valueOf;
                }
            } catch (IllegalArgumentException unused) {
            }
            Map map2 = f84415V;
            g gVar3 = UNSUPPORTED;
            map2.put(str, gVar3);
            return gVar3;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.e$h */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a */
        protected String f84428a;

        /* renamed from: c */
        protected int f84430c;

        /* renamed from: b */
        protected int f84429b = 0;

        /* renamed from: d */
        private final C17889b f84431d = new C17889b();

        public h(String str) {
            this.f84430c = 0;
            String trim = str.trim();
            this.f84428a = trim;
            this.f84430c = trim.length();
        }

        /* renamed from: a */
        public int m88750a() {
            int i11 = this.f84429b;
            int i12 = this.f84430c;
            if (i11 == i12) {
                return -1;
            }
            int i13 = i11 + 1;
            this.f84429b = i13;
            if (i13 >= i12) {
                return -1;
            }
            return this.f84428a.charAt(i13);
        }

        /* renamed from: b */
        public String m88751b() {
            int i11 = this.f84429b;
            while (!m88756g() && !m88759j(this.f84428a.charAt(this.f84429b))) {
                this.f84429b++;
            }
            String substring = this.f84428a.substring(i11, this.f84429b);
            this.f84429b = i11;
            return substring;
        }

        /* renamed from: c */
        public Boolean m88752c(Object obj) {
            if (obj == null) {
                return null;
            }
            m88771v();
            return m88761l();
        }

        /* renamed from: d */
        public float m88753d(float f11) {
            if (Float.isNaN(f11)) {
                return Float.NaN;
            }
            m88771v();
            return m88762m();
        }

        /* renamed from: e */
        public boolean m88754e(char c11) {
            boolean z11;
            int i11 = this.f84429b;
            if (i11 < this.f84430c && this.f84428a.charAt(i11) == c11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f84429b++;
            }
            return z11;
        }

        /* renamed from: f */
        public boolean m88755f(String str) {
            boolean z11;
            int length = str.length();
            int i11 = this.f84429b;
            if (i11 <= this.f84430c - length && this.f84428a.substring(i11, i11 + length).equals(str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f84429b += length;
            }
            return z11;
        }

        /* renamed from: g */
        public boolean m88756g() {
            return this.f84429b == this.f84430c;
        }

        /* renamed from: h */
        public boolean m88757h() {
            int i11 = this.f84429b;
            if (i11 == this.f84430c) {
                return false;
            }
            char charAt = this.f84428a.charAt(i11);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public boolean m88758i(int i11) {
            return i11 == 10 || i11 == 13;
        }

        /* renamed from: j */
        public boolean m88759j(int i11) {
            return i11 == 32 || i11 == 10 || i11 == 13 || i11 == 9;
        }

        /* renamed from: k */
        public Integer m88760k() {
            int i11 = this.f84429b;
            if (i11 == this.f84430c) {
                return null;
            }
            String str = this.f84428a;
            this.f84429b = i11 + 1;
            return Integer.valueOf(str.charAt(i11));
        }

        /* renamed from: l */
        public Boolean m88761l() {
            int i11 = this.f84429b;
            if (i11 == this.f84430c) {
                return null;
            }
            char charAt = this.f84428a.charAt(i11);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z11 = true;
            this.f84429b++;
            if (charAt != '1') {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        /* renamed from: m */
        public float m88762m() {
            float m94433b = this.f84431d.m94433b(this.f84428a, this.f84429b, this.f84430c);
            if (!Float.isNaN(m94433b)) {
                this.f84429b = this.f84431d.m94432a();
            }
            return m94433b;
        }

        /* renamed from: n */
        public String m88763n() {
            if (m88756g()) {
                return null;
            }
            int i11 = this.f84429b;
            int charAt = this.f84428a.charAt(i11);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = m88750a();
            }
            int i12 = this.f84429b;
            while (m88759j(charAt)) {
                charAt = m88750a();
            }
            if (charAt == 40) {
                this.f84429b++;
                return this.f84428a.substring(i11, i12);
            }
            this.f84429b = i11;
            return null;
        }

        /* renamed from: o */
        public C16654c.p m88764o() {
            float m88762m = m88762m();
            if (Float.isNaN(m88762m)) {
                return null;
            }
            C16654c.d1 m88768s = m88768s();
            if (m88768s == null) {
                return new C16654c.p(m88762m, C16654c.d1.px);
            }
            return new C16654c.p(m88762m, m88768s);
        }

        /* renamed from: p */
        public String m88765p() {
            if (m88756g()) {
                return null;
            }
            int i11 = this.f84429b;
            char charAt = this.f84428a.charAt(i11);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int m88750a = m88750a();
            while (m88750a != -1 && m88750a != charAt) {
                m88750a = m88750a();
            }
            if (m88750a == -1) {
                this.f84429b = i11;
                return null;
            }
            int i12 = this.f84429b;
            this.f84429b = i12 + 1;
            return this.f84428a.substring(i11 + 1, i12);
        }

        /* renamed from: q */
        public String m88766q() {
            return m88767r(' ');
        }

        /* renamed from: r */
        public String m88767r(char c11) {
            if (m88756g()) {
                return null;
            }
            char charAt = this.f84428a.charAt(this.f84429b);
            if (m88759j(charAt) || charAt == c11) {
                return null;
            }
            int i11 = this.f84429b;
            int m88750a = m88750a();
            while (m88750a != -1 && m88750a != c11 && !m88759j(m88750a)) {
                m88750a = m88750a();
            }
            return this.f84428a.substring(i11, this.f84429b);
        }

        /* renamed from: s */
        public C16654c.d1 m88768s() {
            if (m88756g()) {
                return null;
            }
            if (this.f84428a.charAt(this.f84429b) == '%') {
                this.f84429b++;
                return C16654c.d1.percent;
            }
            int i11 = this.f84429b;
            if (i11 > this.f84430c - 2) {
                return null;
            }
            try {
                C16654c.d1 valueOf = C16654c.d1.valueOf(this.f84428a.substring(i11, i11 + 2).toLowerCase(Locale.US));
                this.f84429b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: t */
        public float m88769t() {
            m88771v();
            float m94433b = this.f84431d.m94433b(this.f84428a, this.f84429b, this.f84430c);
            if (!Float.isNaN(m94433b)) {
                this.f84429b = this.f84431d.m94432a();
            }
            return m94433b;
        }

        /* renamed from: u */
        public String m88770u() {
            if (m88756g()) {
                return null;
            }
            int i11 = this.f84429b;
            this.f84429b = this.f84430c;
            return this.f84428a.substring(i11);
        }

        /* renamed from: v */
        public boolean m88771v() {
            m88772w();
            int i11 = this.f84429b;
            if (i11 == this.f84430c || this.f84428a.charAt(i11) != ',') {
                return false;
            }
            this.f84429b++;
            m88772w();
            return true;
        }

        /* renamed from: w */
        public void m88772w() {
            while (true) {
                int i11 = this.f84429b;
                if (i11 < this.f84430c && m88759j(this.f84428a.charAt(i11))) {
                    this.f84429b++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:            continue;     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m88648A(C16654c.y yVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 6) {
                                switch (i12) {
                                    case 40:
                                        if ("objectBoundingBox".equals(trim)) {
                                            yVar.f84216q = Boolean.FALSE;
                                            break;
                                        } else if ("userSpaceOnUse".equals(trim)) {
                                            yVar.f84216q = Boolean.TRUE;
                                            break;
                                        } else {
                                            throw new SAXException("Invalid value for attribute patternUnits");
                                        }
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                        if ("objectBoundingBox".equals(trim)) {
                                            yVar.f84217r = Boolean.FALSE;
                                            break;
                                        } else if ("userSpaceOnUse".equals(trim)) {
                                            yVar.f84217r = Boolean.TRUE;
                                            break;
                                        } else {
                                            throw new SAXException("Invalid value for attribute patternContentUnits");
                                        }
                                    case 42:
                                        yVar.f84218s = m88730u0(trim);
                                        break;
                                }
                            } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                                yVar.f84223x = trim;
                            }
                        } else {
                            C16654c.p m88695c0 = m88695c0(trim);
                            yVar.f84222w = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <pattern> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c02 = m88695c0(trim);
                        yVar.f84221v = m88695c02;
                        if (m88695c02.m88531h()) {
                            throw new SAXException("Invalid <pattern> element. width cannot be negative");
                        }
                    }
                } else {
                    yVar.f84220u = m88695c0(trim);
                }
            } else {
                yVar.f84219t = m88695c0(trim);
            }
        }
    }

    /* renamed from: A0 */
    private void m88649A0(Attributes attributes) {
        m88696d("<polyline>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.z zVar = new C16654c.z();
            zVar.f84171a = this.f84284a;
            zVar.f84172b = this.f84285b;
            m88723r(zVar, attributes);
            m88660G(zVar, attributes);
            m88668K(zVar, attributes);
            m88721q(zVar, attributes);
            m88650B(zVar, attributes, "polyline");
            this.f84285b.mo88499j(zVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: B */
    private void m88650B(C16654c.z zVar, Attributes attributes, String str) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (f.m88747c(attributes.getLocalName(i11)) == f.points) {
                h hVar = new h(attributes.getValue(i11));
                ArrayList arrayList = new ArrayList();
                hVar.m88772w();
                while (!hVar.m88756g()) {
                    float m88762m = hVar.m88762m();
                    if (!Float.isNaN(m88762m)) {
                        hVar.m88771v();
                        float m88762m2 = hVar.m88762m();
                        if (!Float.isNaN(m88762m2)) {
                            hVar.m88771v();
                            arrayList.add(Float.valueOf(m88762m));
                            arrayList.add(Float.valueOf(m88762m2));
                        } else {
                            throw new SAXException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SAXException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                zVar.f84224o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    zVar.f84224o[i12] = ((Float) it.next()).floatValue();
                    i12++;
                }
            }
        }
    }

    /* renamed from: B0 */
    public static void m88651B0(C16654c.e0 e0Var, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        switch (a.f84295b[f.m88747c(str).ordinal()]) {
            case 47:
                e0Var.f84081q = m88705h0(str2, "fill");
                e0Var.f84080p |= 1;
                return;
            case 48:
                e0Var.f84082r = m88682S(str2);
                e0Var.f84080p |= 2;
                return;
            case 49:
                e0Var.f84083s = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 4;
                return;
            case 50:
                e0Var.f84084t = m88705h0(str2, "stroke");
                e0Var.f84080p |= 8;
                return;
            case 51:
                e0Var.f84085u = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 16;
                return;
            case 52:
                e0Var.f84086v = m88695c0(str2);
                e0Var.f84080p |= 32;
                return;
            case 53:
                e0Var.f84087w = m88716n0(str2);
                e0Var.f84080p |= 64;
                return;
            case 54:
                e0Var.f84088x = m88718o0(str2);
                e0Var.f84080p |= 128;
                return;
            case 55:
                e0Var.f84089y = Float.valueOf(m88683T(str2));
                e0Var.f84080p |= 256;
                return;
            case 56:
                if ("none".equals(str2)) {
                    e0Var.f84090z = null;
                } else {
                    e0Var.f84090z = m88715m0(str2);
                }
                e0Var.f84080p |= 512;
                return;
            case 57:
                e0Var.f84053A = m88695c0(str2);
                e0Var.f84080p |= 1024;
                return;
            case 58:
                e0Var.f84054B = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 2048;
                return;
            case 59:
                e0Var.f84055C = m88678P(str2);
                e0Var.f84080p |= 4096;
                return;
            case 60:
                m88685V(e0Var, str2);
                return;
            case 61:
                e0Var.f84056D = m88686W(str2);
                e0Var.f84080p |= 8192;
                return;
            case 62:
                e0Var.f84057E = m88687X(str2);
                e0Var.f84080p |= 16384;
                return;
            case 63:
                e0Var.f84058F = m88689Z(str2);
                e0Var.f84080p |= 32768;
                return;
            case 64:
                e0Var.f84059G = m88688Y(str2);
                e0Var.f84080p |= 65536;
                return;
            case 65:
                e0Var.f84060H = m88726s0(str2);
                e0Var.f84080p |= 131072;
                return;
            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                e0Var.f84061I = m88728t0(str2);
                e0Var.f84080p |= 68719476736L;
                return;
            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                e0Var.f84062J = m88724r0(str2);
                e0Var.f84080p |= 262144;
                return;
            case 68:
                e0Var.f84063K = m88703g0(str2);
                e0Var.f84080p |= 524288;
                return;
            case 69:
                String m88691a0 = m88691a0(str2, str);
                e0Var.f84065M = m88691a0;
                e0Var.f84066N = m88691a0;
                e0Var.f84067O = m88691a0;
                e0Var.f84080p |= 14680064;
                return;
            case 70:
                e0Var.f84065M = m88691a0(str2, str);
                e0Var.f84080p |= 2097152;
                return;
            case 71:
                e0Var.f84066N = m88691a0(str2, str);
                e0Var.f84080p |= 4194304;
                return;
            case 72:
                e0Var.f84067O = m88691a0(str2, str);
                e0Var.f84080p |= 8388608;
                return;
            case 73:
                if (str2.indexOf(124) < 0) {
                    if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf('|' + str2 + '|') != -1) {
                        e0Var.f84068P = Boolean.valueOf(!str2.equals("none"));
                        e0Var.f84080p |= 16777216;
                        return;
                    }
                }
                throw new SAXException("Invalid value for \"display\" attribute: " + str2);
            case 74:
                if (str2.indexOf(124) < 0) {
                    if ("|visible|hidden|collapse|".indexOf('|' + str2 + '|') != -1) {
                        e0Var.f84069Q = Boolean.valueOf(str2.equals("visible"));
                        e0Var.f84080p |= 33554432;
                        return;
                    }
                }
                throw new SAXException("Invalid value for \"visibility\" attribute: " + str2);
            case 75:
                if (str2.equals("currentColor")) {
                    e0Var.f84070R = C16654c.g.m88512a();
                } else {
                    e0Var.f84070R = m88678P(str2);
                }
                e0Var.f84080p |= 67108864;
                return;
            case 76:
                e0Var.f84071S = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 134217728;
                return;
            case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                e0Var.f84064L = m88676O(str2);
                e0Var.f84080p |= 1048576;
                return;
            case 78:
                e0Var.f84072T = m88691a0(str2, str);
                e0Var.f84080p |= 268435456;
                return;
            case 79:
                e0Var.f84073U = m88682S(str2);
                e0Var.f84080p |= 536870912;
                return;
            case 80:
                e0Var.f84074V = m88691a0(str2, str);
                e0Var.f84080p |= 1073741824;
                return;
            case 81:
                if (str2.equals("currentColor")) {
                    e0Var.f84075W = C16654c.g.m88512a();
                } else {
                    e0Var.f84075W = m88678P(str2);
                }
                e0Var.f84080p |= 2147483648L;
                return;
            case 82:
                e0Var.f84076X = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 4294967296L;
                return;
            case 83:
                if (str2.equals("currentColor")) {
                    e0Var.f84077Y = C16654c.g.m88512a();
                } else {
                    e0Var.f84077Y = m88678P(str2);
                }
                e0Var.f84080p |= 8589934592L;
                return;
            case 84:
                e0Var.f84078Z = Float.valueOf(m88701f0(str2));
                e0Var.f84080p |= 17179869184L;
                return;
            case 85:
                e0Var.f84079a0 = m88732v0(str2);
                e0Var.f84080p |= 34359738368L;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:            continue;     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m88652C(C16654c.q0 q0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 35) {
                if (i12 != 36) {
                    switch (i12) {
                        case 12:
                            q0Var.f84186m = m88695c0(trim);
                            break;
                        case 13:
                            q0Var.f84187n = m88695c0(trim);
                            break;
                        case 14:
                            C16654c.p m88695c0 = m88695c0(trim);
                            q0Var.f84188o = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                            }
                            break;
                    }
                } else {
                    q0Var.f84190q = m88695c0(trim);
                }
            } else {
                q0Var.f84189p = m88695c0(trim);
            }
        }
    }

    /* renamed from: C0 */
    private void m88653C0(Attributes attributes) {
        m88696d("<radialGradient>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.q0 q0Var = new C16654c.q0();
            q0Var.f84171a = this.f84284a;
            q0Var.f84172b = this.f84285b;
            m88723r(q0Var, attributes);
            m88660G(q0Var, attributes);
            m88727t(q0Var, attributes);
            m88652C(q0Var, attributes);
            this.f84285b.mo88499j(q0Var);
            this.f84285b = q0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: D */
    private void m88654D(C16654c.b0 b0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 10) {
                                if (i12 != 11) {
                                    continue;
                                } else {
                                    C16654c.p m88695c0 = m88695c0(trim);
                                    b0Var.f84031t = m88695c0;
                                    if (m88695c0.m88531h()) {
                                        throw new SAXException("Invalid <rect> element. ry cannot be negative");
                                    }
                                }
                            } else {
                                C16654c.p m88695c02 = m88695c0(trim);
                                b0Var.f84030s = m88695c02;
                                if (m88695c02.m88531h()) {
                                    throw new SAXException("Invalid <rect> element. rx cannot be negative");
                                }
                            }
                        } else {
                            C16654c.p m88695c03 = m88695c0(trim);
                            b0Var.f84029r = m88695c03;
                            if (m88695c03.m88531h()) {
                                throw new SAXException("Invalid <rect> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c04 = m88695c0(trim);
                        b0Var.f84028q = m88695c04;
                        if (m88695c04.m88531h()) {
                            throw new SAXException("Invalid <rect> element. width cannot be negative");
                        }
                    }
                } else {
                    b0Var.f84027p = m88695c0(trim);
                }
            } else {
                b0Var.f84026o = m88695c0(trim);
            }
        }
    }

    /* renamed from: D0 */
    private void m88655D0(Attributes attributes) {
        m88696d("<rect>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.b0 b0Var = new C16654c.b0();
            b0Var.f84171a = this.f84284a;
            b0Var.f84172b = this.f84285b;
            m88723r(b0Var, attributes);
            m88660G(b0Var, attributes);
            m88668K(b0Var, attributes);
            m88721q(b0Var, attributes);
            m88654D(b0Var, attributes);
            this.f84285b.mo88499j(b0Var);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: E */
    private void m88656E(C16654c.f0 f0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                f0Var.f84133u = trim;
                            }
                        } else {
                            C16654c.p m88695c0 = m88695c0(trim);
                            f0Var.f84132t = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <svg> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c02 = m88695c0(trim);
                        f0Var.f84131s = m88695c02;
                        if (m88695c02.m88531h()) {
                            throw new SAXException("Invalid <svg> element. width cannot be negative");
                        }
                    }
                } else {
                    f0Var.f84130r = m88695c0(trim);
                }
            } else {
                f0Var.f84129q = m88695c0(trim);
            }
        }
    }

    /* renamed from: E0 */
    private void m88657E0(Attributes attributes) {
        m88696d("<solidColor>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.c0 c0Var = new C16654c.c0();
            c0Var.f84171a = this.f84284a;
            c0Var.f84172b = this.f84285b;
            m88723r(c0Var, attributes);
            m88660G(c0Var, attributes);
            this.f84285b.mo88499j(c0Var);
            this.f84285b = c0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: F */
    private void m88658F(C16654c.d0 d0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            if (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()] == 37) {
                d0Var.f84041h = m88693b0(trim);
            }
        }
    }

    /* renamed from: F0 */
    private void m88659F0(Attributes attributes) {
        m88696d("<stop>", new Object[0]);
        C16654c.j0 j0Var = this.f84285b;
        if (j0Var != null) {
            if (j0Var instanceof C16654c.j) {
                C16654c.d0 d0Var = new C16654c.d0();
                d0Var.f84171a = this.f84284a;
                d0Var.f84172b = this.f84285b;
                m88723r(d0Var, attributes);
                m88660G(d0Var, attributes);
                m88658F(d0Var, attributes);
                this.f84285b.mo88499j(d0Var);
                this.f84285b = d0Var;
                return;
            }
            throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: G */
    private void m88660G(C16654c.l0 l0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            if (trim.length() != 0) {
                int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
                if (i12 != 45) {
                    if (i12 != 46) {
                        if (l0Var.f84163e == null) {
                            l0Var.f84163e = new C16654c.e0();
                        }
                        m88651B0(l0Var.f84163e, attributes.getLocalName(i11), attributes.getValue(i11).trim());
                    } else {
                        l0Var.f84165g = C16652a.m88442f(trim);
                    }
                } else {
                    m88720p0(l0Var, trim);
                }
            }
        }
    }

    /* renamed from: G0 */
    private void m88661G0(Attributes attributes) {
        m88696d("<style>", new Object[0]);
        if (this.f84285b != null) {
            String str = "all";
            boolean z11 = true;
            for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                String trim = attributes.getValue(i11).trim();
                int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
                if (i12 != 87) {
                    if (i12 == 88) {
                        str = trim;
                    }
                } else {
                    z11 = trim.equals("text/css");
                }
            }
            if (z11 && C16652a.m88439b(str, C16652a.f.screen)) {
                this.f84291h = true;
                return;
            } else {
                this.f84286c = true;
                this.f84287d = 1;
                return;
            }
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: H */
    private void m88662H(C16654c.u0 u0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            if (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()] == 6 && "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                u0Var.f84206o = trim;
            }
        }
    }

    /* renamed from: H0 */
    private void m88663H0(Attributes attributes) {
        m88696d("<svg>", new Object[0]);
        C16654c.f0 f0Var = new C16654c.f0();
        f0Var.f84171a = this.f84284a;
        f0Var.f84172b = this.f84285b;
        m88723r(f0Var, attributes);
        m88660G(f0Var, attributes);
        m88721q(f0Var, attributes);
        m88672M(f0Var, attributes);
        m88656E(f0Var, attributes);
        C16654c.j0 j0Var = this.f84285b;
        if (j0Var == null) {
            this.f84284a.m88492m(f0Var);
        } else {
            j0Var.mo88499j(f0Var);
        }
        this.f84285b = f0Var;
    }

    /* renamed from: I */
    private void m88664I(C16654c.z0 z0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                if (i12 == 39) {
                    z0Var.f84226p = m88695c0(trim);
                }
            } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                z0Var.f84225o = trim;
            }
        }
    }

    /* renamed from: I0 */
    private void m88665I0(Attributes attributes) {
        m88696d("<symbol>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.r0 t0Var = new C16654c.t0();
            t0Var.f84171a = this.f84284a;
            t0Var.f84172b = this.f84285b;
            m88723r(t0Var, attributes);
            m88660G(t0Var, attributes);
            m88721q(t0Var, attributes);
            m88672M(t0Var, attributes);
            this.f84285b.mo88499j(t0Var);
            this.f84285b = t0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: J */
    private void m88666J(C16654c.a1 a1Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 19) {
                        if (i12 == 20) {
                            a1Var.f84021r = m88697d0(trim);
                        }
                    } else {
                        a1Var.f84020q = m88697d0(trim);
                    }
                } else {
                    a1Var.f84019p = m88697d0(trim);
                }
            } else {
                a1Var.f84018o = m88697d0(trim);
            }
        }
    }

    /* renamed from: J0 */
    private void m88667J0(Attributes attributes) {
        m88696d("<text>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.w0 w0Var = new C16654c.w0();
            w0Var.f84171a = this.f84284a;
            w0Var.f84172b = this.f84285b;
            m88723r(w0Var, attributes);
            m88660G(w0Var, attributes);
            m88668K(w0Var, attributes);
            m88721q(w0Var, attributes);
            m88666J(w0Var, attributes);
            this.f84285b.mo88499j(w0Var);
            this.f84285b = w0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: K */
    private void m88668K(C16654c.n nVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            if (f.m88747c(attributes.getLocalName(i11)) == f.transform) {
                nVar.mo88524l(m88730u0(attributes.getValue(i11)));
            }
        }
    }

    /* renamed from: K0 */
    private void m88669K0(Attributes attributes) {
        m88696d("<textPath>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.z0 z0Var = new C16654c.z0();
            z0Var.f84171a = this.f84284a;
            z0Var.f84172b = this.f84285b;
            m88723r(z0Var, attributes);
            m88660G(z0Var, attributes);
            m88721q(z0Var, attributes);
            m88664I(z0Var, attributes);
            this.f84285b.mo88499j(z0Var);
            this.f84285b = z0Var;
            C16654c.j0 j0Var = z0Var.f84172b;
            if (j0Var instanceof C16654c.b1) {
                z0Var.m88544o((C16654c.b1) j0Var);
                return;
            } else {
                z0Var.m88544o(((C16654c.x0) j0Var).mo88500e());
                return;
            }
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: L */
    private void m88670L(C16654c.e1 e1Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 6 && "http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                                e1Var.f84122p = trim;
                            }
                        } else {
                            C16654c.p m88695c0 = m88695c0(trim);
                            e1Var.f84126t = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <use> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c02 = m88695c0(trim);
                        e1Var.f84125s = m88695c02;
                        if (m88695c02.m88531h()) {
                            throw new SAXException("Invalid <use> element. width cannot be negative");
                        }
                    }
                } else {
                    e1Var.f84124r = m88695c0(trim);
                }
            } else {
                e1Var.f84123q = m88695c0(trim);
            }
        }
    }

    /* renamed from: L0 */
    private void m88671L0(Attributes attributes) {
        m88696d("<tref>", new Object[0]);
        C16654c.j0 j0Var = this.f84285b;
        if (j0Var != null) {
            if (j0Var instanceof C16654c.y0) {
                C16654c.u0 u0Var = new C16654c.u0();
                u0Var.f84171a = this.f84284a;
                u0Var.f84172b = this.f84285b;
                m88723r(u0Var, attributes);
                m88660G(u0Var, attributes);
                m88721q(u0Var, attributes);
                m88662H(u0Var, attributes);
                this.f84285b.mo88499j(u0Var);
                C16654c.j0 j0Var2 = u0Var.f84172b;
                if (j0Var2 instanceof C16654c.b1) {
                    u0Var.m88533o((C16654c.b1) j0Var2);
                    return;
                } else {
                    u0Var.m88533o(((C16654c.x0) j0Var2).mo88500e());
                    return;
                }
            }
            throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: M */
    private void m88672M(C16654c.r0 r0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 7) {
                if (i12 == 86) {
                    r0Var.f84197p = m88734w0(trim);
                }
            } else {
                m88709j0(r0Var, trim);
            }
        }
    }

    /* renamed from: M0 */
    private void m88673M0(Attributes attributes) {
        m88696d("<tspan>", new Object[0]);
        C16654c.j0 j0Var = this.f84285b;
        if (j0Var != null) {
            if (j0Var instanceof C16654c.y0) {
                C16654c.v0 v0Var = new C16654c.v0();
                v0Var.f84171a = this.f84284a;
                v0Var.f84172b = this.f84285b;
                m88723r(v0Var, attributes);
                m88660G(v0Var, attributes);
                m88721q(v0Var, attributes);
                m88666J(v0Var, attributes);
                this.f84285b.mo88499j(v0Var);
                this.f84285b = v0Var;
                C16654c.j0 j0Var2 = v0Var.f84172b;
                if (j0Var2 instanceof C16654c.b1) {
                    v0Var.m88534o((C16654c.b1) j0Var2);
                    return;
                } else {
                    v0Var.m88534o(((C16654c.x0) j0Var2).mo88500e());
                    return;
                }
            }
            throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: N */
    private void m88674N(String str) {
        this.f84284a.m88482a(new C16652a(C16652a.f.screen).m88454d(str));
    }

    /* renamed from: N0 */
    private void m88675N0(Attributes attributes) {
        m88696d("<use>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.e1 e1Var = new C16654c.e1();
            e1Var.f84171a = this.f84284a;
            e1Var.f84172b = this.f84285b;
            m88723r(e1Var, attributes);
            m88660G(e1Var, attributes);
            m88668K(e1Var, attributes);
            m88721q(e1Var, attributes);
            m88670L(e1Var, attributes);
            this.f84285b.mo88499j(e1Var);
            this.f84285b = e1Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: O */
    private static C16654c.c m88676O(String str) {
        if ("auto".equals(str)) {
            return null;
        }
        if (str.toLowerCase(Locale.US).startsWith("rect(")) {
            h hVar = new h(str.substring(5));
            hVar.m88772w();
            C16654c.p m88699e0 = m88699e0(hVar);
            hVar.m88771v();
            C16654c.p m88699e02 = m88699e0(hVar);
            hVar.m88771v();
            C16654c.p m88699e03 = m88699e0(hVar);
            hVar.m88771v();
            C16654c.p m88699e04 = m88699e0(hVar);
            hVar.m88772w();
            if (hVar.m88754e(')')) {
                return new C16654c.c(m88699e0, m88699e02, m88699e03, m88699e04);
            }
            throw new SAXException("Bad rect() clip definition: " + str);
        }
        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
    }

    /* renamed from: O0 */
    private void m88677O0(Attributes attributes) {
        m88696d("<view>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.r0 f1Var = new C16654c.f1();
            f1Var.f84171a = this.f84284a;
            f1Var.f84172b = this.f84285b;
            m88723r(f1Var, attributes);
            m88721q(f1Var, attributes);
            m88672M(f1Var, attributes);
            this.f84285b.mo88499j(f1Var);
            this.f84285b = f1Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: P */
    private static C16654c.f m88678P(String str) {
        if (str.charAt(0) == '#') {
            C17888a m94429b = C17888a.m94429b(str, 1, str.length());
            if (m94429b != null) {
                int m94430a = m94429b.m94430a();
                if (m94430a == 7) {
                    return new C16654c.f(m94429b.m94431c());
                }
                if (m94430a == 4) {
                    int m94431c = m94429b.m94431c();
                    int i11 = m94431c & 3840;
                    int i12 = m94431c & 240;
                    int i13 = m94431c & 15;
                    return new C16654c.f(i13 | (i11 << 8) | (i11 << 12) | (i12 << 8) | (i12 << 4) | (i13 << 4));
                }
                throw new SAXException("Bad hex colour value: " + str);
            }
            throw new SAXException("Bad hex colour value: " + str);
        }
        if (str.toLowerCase(Locale.US).startsWith("rgb(")) {
            h hVar = new h(str.substring(4));
            hVar.m88772w();
            float m88762m = hVar.m88762m();
            if (!Float.isNaN(m88762m) && hVar.m88754e('%')) {
                m88762m = (m88762m * 256.0f) / 100.0f;
            }
            float m88753d = hVar.m88753d(m88762m);
            if (!Float.isNaN(m88753d) && hVar.m88754e('%')) {
                m88753d = (m88753d * 256.0f) / 100.0f;
            }
            float m88753d2 = hVar.m88753d(m88753d);
            if (!Float.isNaN(m88753d2) && hVar.m88754e('%')) {
                m88753d2 = (m88753d2 * 256.0f) / 100.0f;
            }
            hVar.m88772w();
            if (!Float.isNaN(m88753d2) && hVar.m88754e(')')) {
                return new C16654c.f((m88692b(m88762m) << 16) | (m88692b(m88753d) << 8) | m88692b(m88753d2));
            }
            throw new SAXException("Bad rgb() colour value: " + str);
        }
        return m88680Q(str);
    }

    /* renamed from: P0 */
    private void m88679P0(Attributes attributes) {
        m88696d("<switch>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.s0 s0Var = new C16654c.s0();
            s0Var.f84171a = this.f84284a;
            s0Var.f84172b = this.f84285b;
            m88723r(s0Var, attributes);
            m88660G(s0Var, attributes);
            m88668K(s0Var, attributes);
            m88721q(s0Var, attributes);
            this.f84285b.mo88499j(s0Var);
            this.f84285b = s0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: Q */
    private static C16654c.f m88680Q(String str) {
        Integer m88743a = c.m88743a(str.toLowerCase(Locale.US));
        if (m88743a != null) {
            return new C16654c.f(m88743a.intValue());
        }
        throw new SAXException("Invalid colour keyword: " + str);
    }

    /* renamed from: R */
    private static C16654c.o0 m88681R(String str) {
        if (str.equals("none")) {
            return null;
        }
        if (str.equals("currentColor")) {
            return C16654c.g.m88512a();
        }
        return m88678P(str);
    }

    /* renamed from: S */
    private static C16654c.e0.a m88682S(String str) {
        if ("nonzero".equals(str)) {
            return C16654c.e0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C16654c.e0.a.EvenOdd;
        }
        throw new SAXException("Invalid fill-rule property: " + str);
    }

    /* renamed from: T */
    private static float m88683T(String str) {
        int length = str.length();
        if (length != 0) {
            return m88684U(str, 0, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    /* renamed from: U */
    private static float m88684U(String str, int i11, int i12) {
        float m94433b = new C17889b().m94433b(str, i11, i12);
        if (!Float.isNaN(m94433b)) {
            return m94433b;
        }
        throw new SAXException("Invalid float value: " + str);
    }

    /* renamed from: V */
    private static void m88685V(C16654c.e0 e0Var, String str) {
        String m88767r;
        int intValue;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf('|' + str + '|') != -1) {
            return;
        }
        h hVar = new h(str);
        Integer num = null;
        C16654c.e0.b bVar = null;
        String str2 = null;
        while (true) {
            m88767r = hVar.m88767r('/');
            hVar.m88772w();
            if (m88767r != null) {
                if (num != null && bVar != null) {
                    break;
                }
                if (!m88767r.equals("normal") && (num != null || (num = e.m88745a(m88767r)) == null)) {
                    if (bVar != null || (bVar = m88702g(m88767r)) == null) {
                        if (str2 != null || !m88767r.equals("small-caps")) {
                            break;
                        } else {
                            str2 = m88767r;
                        }
                    }
                }
            } else {
                throw new SAXException("Invalid font style attribute: missing font size and family");
            }
        }
        C16654c.p m88687X = m88687X(m88767r);
        if (hVar.m88754e('/')) {
            hVar.m88772w();
            String m88766q = hVar.m88766q();
            if (m88766q != null) {
                m88695c0(m88766q);
                hVar.m88772w();
            } else {
                throw new SAXException("Invalid font style attribute: missing line-height");
            }
        }
        e0Var.f84056D = m88686W(hVar.m88770u());
        e0Var.f84057E = m88687X;
        if (num == null) {
            intValue = 400;
        } else {
            intValue = num.intValue();
        }
        e0Var.f84058F = Integer.valueOf(intValue);
        if (bVar == null) {
            bVar = C16654c.e0.b.Normal;
        }
        e0Var.f84059G = bVar;
        e0Var.f84080p |= 122880;
    }

    /* renamed from: W */
    private static List m88686W(String str) {
        h hVar = new h(str);
        ArrayList arrayList = null;
        do {
            String m88765p = hVar.m88765p();
            if (m88765p == null) {
                m88765p = hVar.m88767r(',');
            }
            if (m88765p == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(m88765p);
            hVar.m88771v();
        } while (!hVar.m88756g());
        return arrayList;
    }

    /* renamed from: X */
    private static C16654c.p m88687X(String str) {
        C16654c.p m88744a = d.m88744a(str);
        if (m88744a == null) {
            return m88695c0(str);
        }
        return m88744a;
    }

    /* renamed from: Y */
    private static C16654c.e0.b m88688Y(String str) {
        C16654c.e0.b m88702g = m88702g(str);
        if (m88702g != null) {
            return m88702g;
        }
        throw new SAXException("Invalid font-style property: " + str);
    }

    /* renamed from: Z */
    private static Integer m88689Z(String str) {
        Integer m88745a = e.m88745a(str);
        if (m88745a != null) {
            return m88745a;
        }
        throw new SAXException("Invalid font-weight property: " + str);
    }

    /* renamed from: a */
    private void m88690a(Attributes attributes) {
        m88696d("<circle>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.d dVar = new C16654c.d();
            dVar.f84171a = this.f84284a;
            dVar.f84172b = this.f84285b;
            m88723r(dVar, attributes);
            m88660G(dVar, attributes);
            m88668K(dVar, attributes);
            m88721q(dVar, attributes);
            m88717o(dVar, attributes);
            this.f84285b.mo88499j(dVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: a0 */
    private static String m88691a0(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException("Bad " + str2 + " attribute. Expected \"none\" or \"url()\" format");
    }

    /* renamed from: b */
    private static int m88692b(float f11) {
        if (f11 < 0.0f) {
            return 0;
        }
        if (f11 > 255.0f) {
            return 255;
        }
        return Math.round(f11);
    }

    /* renamed from: b0 */
    private Float m88693b0(String str) {
        if (str.length() != 0) {
            int length = str.length();
            boolean z11 = true;
            if (str.charAt(str.length() - 1) == '%') {
                length--;
            } else {
                z11 = false;
            }
            try {
                float m88684U = m88684U(str, 0, length);
                float f11 = 100.0f;
                if (z11) {
                    m88684U /= 100.0f;
                }
                if (m88684U < 0.0f) {
                    f11 = 0.0f;
                } else if (m88684U <= 100.0f) {
                    f11 = m88684U;
                }
                return Float.valueOf(f11);
            } catch (NumberFormatException e11) {
                throw new SAXException("Invalid offset value in <stop>: " + str, e11);
            }
        }
        throw new SAXException("Invalid offset value in <stop> (empty string)");
    }

    /* renamed from: c */
    private void m88694c(Attributes attributes) {
        m88696d("<clipPath>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.e eVar = new C16654c.e();
            eVar.f84171a = this.f84284a;
            eVar.f84172b = this.f84285b;
            m88723r(eVar, attributes);
            m88660G(eVar, attributes);
            m88668K(eVar, attributes);
            m88721q(eVar, attributes);
            m88719p(eVar, attributes);
            this.f84285b.mo88499j(eVar);
            this.f84285b = eVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: c0 */
    protected static C16654c.p m88695c0(String str) {
        if (str.length() != 0) {
            int length = str.length();
            C16654c.d1 d1Var = C16654c.d1.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                d1Var = C16654c.d1.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    d1Var = C16654c.d1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new SAXException("Invalid length unit specifier: " + str);
                }
            }
            try {
                return new C16654c.p(m88684U(str, 0, length), d1Var);
            } catch (NumberFormatException e11) {
                throw new SAXException("Invalid length value: " + str, e11);
            }
        }
        throw new SAXException("Invalid length value (empty string)");
    }

    /* renamed from: d */
    private void m88696d(String str, Object... objArr) {
    }

    /* renamed from: d0 */
    private static List m88697d0(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            h hVar = new h(str);
            hVar.m88772w();
            while (!hVar.m88756g()) {
                float m88762m = hVar.m88762m();
                if (!Float.isNaN(m88762m)) {
                    C16654c.d1 m88768s = hVar.m88768s();
                    if (m88768s == null) {
                        m88768s = C16654c.d1.px;
                    }
                    arrayList.add(new C16654c.p(m88762m, m88768s));
                    hVar.m88771v();
                } else {
                    throw new SAXException("Invalid length list value: " + hVar.m88751b());
                }
            }
            return arrayList;
        }
        throw new SAXException("Invalid length list (empty string)");
    }

    /* renamed from: e */
    private void m88698e(Attributes attributes) {
        m88696d("<defs>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.h hVar = new C16654c.h();
            hVar.f84171a = this.f84284a;
            hVar.f84172b = this.f84285b;
            m88723r(hVar, attributes);
            m88660G(hVar, attributes);
            m88668K(hVar, attributes);
            this.f84285b.mo88499j(hVar);
            this.f84285b = hVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: e0 */
    private static C16654c.p m88699e0(h hVar) {
        if (hVar.m88755f("auto")) {
            return new C16654c.p(0.0f);
        }
        return hVar.m88764o();
    }

    /* renamed from: f */
    private void m88700f(Attributes attributes) {
        m88696d("<ellipse>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.i iVar = new C16654c.i();
            iVar.f84171a = this.f84284a;
            iVar.f84172b = this.f84285b;
            m88723r(iVar, attributes);
            m88660G(iVar, attributes);
            m88668K(iVar, attributes);
            m88721q(iVar, attributes);
            m88725s(iVar, attributes);
            this.f84285b.mo88499j(iVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: f0 */
    private static float m88701f0(String str) {
        float m88683T = m88683T(str);
        if (m88683T < 0.0f) {
            return 0.0f;
        }
        if (m88683T > 1.0f) {
            return 1.0f;
        }
        return m88683T;
    }

    /* renamed from: g */
    private static C16654c.e0.b m88702g(String str) {
        if ("italic".equals(str)) {
            return C16654c.e0.b.Italic;
        }
        if ("normal".equals(str)) {
            return C16654c.e0.b.Normal;
        }
        if ("oblique".equals(str)) {
            return C16654c.e0.b.Oblique;
        }
        return null;
    }

    /* renamed from: g0 */
    private static Boolean m88703g0(String str) {
        if (!"visible".equals(str) && !"auto".equals(str)) {
            if (!"hidden".equals(str) && !"scroll".equals(str)) {
                throw new SAXException("Invalid toverflow property: " + str);
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* renamed from: h */
    private void m88704h(Attributes attributes) {
        m88696d("<g>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.m mVar = new C16654c.m();
            mVar.f84171a = this.f84284a;
            mVar.f84172b = this.f84285b;
            m88723r(mVar, attributes);
            m88660G(mVar, attributes);
            m88668K(mVar, attributes);
            m88721q(mVar, attributes);
            this.f84285b.mo88499j(mVar);
            this.f84285b = mVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: h0 */
    private static C16654c.o0 m88705h0(String str, String str2) {
        C16654c.o0 o0Var;
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim2.length() > 0) {
                    o0Var = m88681R(trim2);
                } else {
                    o0Var = null;
                }
                return new C16654c.u(trim, o0Var);
            }
            throw new SAXException("Bad " + str2 + " attribute. Unterminated url() reference");
        }
        return m88681R(str);
    }

    /* renamed from: i */
    private void m88706i(Attributes attributes) {
        m88696d("<image>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.o oVar = new C16654c.o();
            oVar.f84171a = this.f84284a;
            oVar.f84172b = this.f84285b;
            m88723r(oVar, attributes);
            m88660G(oVar, attributes);
            m88668K(oVar, attributes);
            m88721q(oVar, attributes);
            m88729u(oVar, attributes);
            this.f84285b.mo88499j(oVar);
            this.f84285b = oVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0033. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d9 A[SYNTHETIC] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C16654c.w m88707i0(String str) {
        float f11;
        float m88753d;
        float f12;
        float f13;
        float f14;
        float f15;
        h hVar = new h(str);
        C16654c.w wVar = new C16654c.w();
        if (hVar.m88756g()) {
            return wVar;
        }
        int intValue = hVar.m88760k().intValue();
        int i11 = 109;
        if (intValue != 77 && intValue != 109) {
            return wVar;
        }
        int i12 = intValue;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (true) {
            hVar.m88772w();
            int i13 = 108;
            switch (i12) {
                case 65:
                case 97:
                    float m88762m = hVar.m88762m();
                    float m88753d2 = hVar.m88753d(m88762m);
                    float m88753d3 = hVar.m88753d(m88753d2);
                    Boolean m88752c = hVar.m88752c(Float.valueOf(m88753d3));
                    Boolean m88752c2 = hVar.m88752c(m88752c);
                    if (m88752c2 == null) {
                        m88753d = Float.NaN;
                        f11 = Float.NaN;
                    } else {
                        float m88769t = hVar.m88769t();
                        f11 = m88769t;
                        m88753d = hVar.m88753d(m88769t);
                    }
                    if (!Float.isNaN(m88753d) && m88762m >= 0.0f && m88753d2 >= 0.0f) {
                        if (i12 == 97) {
                            f11 += f16;
                            m88753d += f18;
                        }
                        float f23 = m88753d;
                        wVar.mo88540d(m88762m, m88753d2, m88753d3, m88752c.booleanValue(), m88752c2.booleanValue(), f11, f23);
                        f18 = f23;
                        f19 = f18;
                        f16 = f11;
                        f17 = f16;
                        hVar.m88771v();
                        if (!hVar.m88756g()) {
                            return wVar;
                        }
                        if (hVar.m88757h()) {
                            i12 = hVar.m88760k().intValue();
                        }
                        i11 = 109;
                    }
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                case 99:
                    float m88762m2 = hVar.m88762m();
                    float m88753d4 = hVar.m88753d(m88762m2);
                    float m88753d5 = hVar.m88753d(m88753d4);
                    float m88753d6 = hVar.m88753d(m88753d5);
                    float m88753d7 = hVar.m88753d(m88753d6);
                    float m88753d8 = hVar.m88753d(m88753d7);
                    if (Float.isNaN(m88753d8)) {
                        return wVar;
                    }
                    if (i12 == 99) {
                        m88753d7 += f16;
                        m88753d8 += f18;
                        m88762m2 += f16;
                        m88753d4 += f18;
                        m88753d5 += f16;
                        m88753d6 += f18;
                    }
                    f12 = m88753d5;
                    f13 = m88753d6;
                    f14 = m88753d8;
                    f15 = m88753d7;
                    wVar.mo88539c(m88762m2, m88753d4, f12, f13, f15, f14);
                    f16 = f15;
                    f17 = f12;
                    f18 = f14;
                    f19 = f13;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 72:
                case 104:
                    float m88762m3 = hVar.m88762m();
                    if (Float.isNaN(m88762m3)) {
                        return wVar;
                    }
                    if (i12 == 104) {
                        m88762m3 += f16;
                    }
                    f16 = m88762m3;
                    wVar.mo88541e(f16, f18);
                    f17 = f16;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 76:
                case 108:
                    float m88762m4 = hVar.m88762m();
                    float m88753d9 = hVar.m88753d(m88762m4);
                    if (Float.isNaN(m88753d9)) {
                        return wVar;
                    }
                    if (i12 == 108) {
                        m88762m4 += f16;
                        m88753d9 += f18;
                    }
                    f16 = m88762m4;
                    f18 = m88753d9;
                    wVar.mo88541e(f16, f18);
                    f17 = f16;
                    f19 = f18;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                case 109:
                    float m88762m5 = hVar.m88762m();
                    float m88753d10 = hVar.m88753d(m88762m5);
                    if (Float.isNaN(m88753d10)) {
                        return wVar;
                    }
                    if (i12 == i11 && !wVar.m88543i()) {
                        m88762m5 += f16;
                        m88753d10 += f18;
                    }
                    f16 = m88762m5;
                    f18 = m88753d10;
                    wVar.mo88538b(f16, f18);
                    if (i12 != i11) {
                        i13 = 76;
                    }
                    f17 = f16;
                    f21 = f17;
                    f19 = f18;
                    f22 = f19;
                    i12 = i13;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 81:
                case 113:
                    f17 = hVar.m88762m();
                    f19 = hVar.m88753d(f17);
                    float m88753d11 = hVar.m88753d(f19);
                    float m88753d12 = hVar.m88753d(m88753d11);
                    if (Float.isNaN(m88753d12)) {
                        return wVar;
                    }
                    if (i12 == 113) {
                        m88753d11 += f16;
                        m88753d12 += f18;
                        f17 += f16;
                        f19 += f18;
                    }
                    f16 = m88753d11;
                    f18 = m88753d12;
                    wVar.mo88537a(f17, f19, f16, f18);
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 83:
                case 115:
                    float f24 = (f16 * 2.0f) - f17;
                    float f25 = (2.0f * f18) - f19;
                    float m88762m6 = hVar.m88762m();
                    float m88753d13 = hVar.m88753d(m88762m6);
                    float m88753d14 = hVar.m88753d(m88753d13);
                    float m88753d15 = hVar.m88753d(m88753d14);
                    if (Float.isNaN(m88753d15)) {
                        return wVar;
                    }
                    if (i12 == 115) {
                        m88753d14 += f16;
                        m88753d15 += f18;
                        m88762m6 += f16;
                        m88753d13 += f18;
                    }
                    f12 = m88762m6;
                    f13 = m88753d13;
                    f14 = m88753d15;
                    f15 = m88753d14;
                    wVar.mo88539c(f24, f25, f12, f13, f15, f14);
                    f16 = f15;
                    f17 = f12;
                    f18 = f14;
                    f19 = f13;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 84:
                case 116:
                    f17 = (f16 * 2.0f) - f17;
                    f19 = (2.0f * f18) - f19;
                    float m88762m7 = hVar.m88762m();
                    float m88753d16 = hVar.m88753d(m88762m7);
                    if (Float.isNaN(m88753d16)) {
                        return wVar;
                    }
                    if (i12 == 116) {
                        m88762m7 += f16;
                        m88753d16 += f18;
                    }
                    f16 = m88762m7;
                    f18 = m88753d16;
                    wVar.mo88537a(f17, f19, f16, f18);
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 86:
                case 118:
                    float m88762m8 = hVar.m88762m();
                    if (Float.isNaN(m88762m8)) {
                        return wVar;
                    }
                    if (i12 == 118) {
                        m88762m8 += f18;
                    }
                    f18 = m88762m8;
                    wVar.mo88541e(f16, f18);
                    f19 = f18;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                case 90:
                case ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422 /* 122 */:
                    wVar.close();
                    f16 = f21;
                    f17 = f16;
                    f18 = f22;
                    f19 = f18;
                    hVar.m88771v();
                    if (!hVar.m88756g()) {
                    }
                    break;
                default:
                    return wVar;
            }
        }
    }

    /* renamed from: j */
    private void m88708j(Attributes attributes) {
        m88696d("<line>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.q qVar = new C16654c.q();
            qVar.f84171a = this.f84284a;
            qVar.f84172b = this.f84285b;
            m88723r(qVar, attributes);
            m88660G(qVar, attributes);
            m88668K(qVar, attributes);
            m88721q(qVar, attributes);
            m88731v(qVar, attributes);
            this.f84285b.mo88499j(qVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: j0 */
    private static void m88709j0(C16654c.p0 p0Var, String str) {
        C16653b.b bVar;
        h hVar = new h(str);
        hVar.m88772w();
        String m88766q = hVar.m88766q();
        if ("defer".equals(m88766q)) {
            hVar.m88772w();
            m88766q = hVar.m88766q();
        }
        C16653b.a m88742a = b.m88742a(m88766q);
        hVar.m88772w();
        if (!hVar.m88756g()) {
            String m88766q2 = hVar.m88766q();
            if (m88766q2.equals("meet")) {
                bVar = C16653b.b.Meet;
            } else if (m88766q2.equals("slice")) {
                bVar = C16653b.b.Slice;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: " + str);
            }
        } else {
            bVar = null;
        }
        p0Var.f84181o = new C16653b(m88742a, bVar);
    }

    /* renamed from: k */
    private void m88710k(Attributes attributes) {
        m88696d("<linearGradient>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.m0 m0Var = new C16654c.m0();
            m0Var.f84171a = this.f84284a;
            m0Var.f84172b = this.f84285b;
            m88723r(m0Var, attributes);
            m88660G(m0Var, attributes);
            m88727t(m0Var, attributes);
            m88733w(m0Var, attributes);
            this.f84285b.mo88499j(m0Var);
            this.f84285b = m0Var;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: k0 */
    private static Set m88711k0(String str) {
        h hVar = new h(str);
        HashSet hashSet = new HashSet();
        while (!hVar.m88756g()) {
            String m88766q = hVar.m88766q();
            if (m88766q.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(m88766q.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            hVar.m88772w();
        }
        return hashSet;
    }

    /* renamed from: l */
    private void m88712l(Attributes attributes) {
        m88696d("<marker>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.r rVar = new C16654c.r();
            rVar.f84171a = this.f84284a;
            rVar.f84172b = this.f84285b;
            m88723r(rVar, attributes);
            m88660G(rVar, attributes);
            m88721q(rVar, attributes);
            m88672M(rVar, attributes);
            m88735x(rVar, attributes);
            this.f84285b.mo88499j(rVar);
            this.f84285b = rVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: l0 */
    private static Set m88713l0(String str) {
        h hVar = new h(str);
        HashSet hashSet = new HashSet();
        while (!hVar.m88756g()) {
            hashSet.add(hVar.m88766q());
            hVar.m88772w();
        }
        return hashSet;
    }

    /* renamed from: m */
    private void m88714m(Attributes attributes) {
        m88696d("<mask>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.s sVar = new C16654c.s();
            sVar.f84171a = this.f84284a;
            sVar.f84172b = this.f84285b;
            m88723r(sVar, attributes);
            m88660G(sVar, attributes);
            m88721q(sVar, attributes);
            m88737y(sVar, attributes);
            this.f84285b.mo88499j(sVar);
            this.f84285b = sVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: m0 */
    private static C16654c.p[] m88715m0(String str) {
        C16654c.p m88764o;
        h hVar = new h(str);
        hVar.m88772w();
        if (hVar.m88756g() || (m88764o = hVar.m88764o()) == null) {
            return null;
        }
        if (!m88764o.m88531h()) {
            float m88525a = m88764o.m88525a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(m88764o);
            while (!hVar.m88756g()) {
                hVar.m88771v();
                C16654c.p m88764o2 = hVar.m88764o();
                if (m88764o2 != null) {
                    if (!m88764o2.m88531h()) {
                        arrayList.add(m88764o2);
                        m88525a += m88764o2.m88525a();
                    } else {
                        throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: " + str);
                    }
                } else {
                    throw new SAXException("Invalid stroke-dasharray. Non-Length content found: " + str);
                }
            }
            if (m88525a == 0.0f) {
                return null;
            }
            return (C16654c.p[]) arrayList.toArray(new C16654c.p[arrayList.size()]);
        }
        throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: " + str);
    }

    /* renamed from: n0 */
    private static C16654c.e0.c m88716n0(String str) {
        if ("butt".equals(str)) {
            return C16654c.e0.c.Butt;
        }
        if ("round".equals(str)) {
            return C16654c.e0.c.Round;
        }
        if ("square".equals(str)) {
            return C16654c.e0.c.Square;
        }
        throw new SAXException("Invalid stroke-linecap property: " + str);
    }

    /* renamed from: o */
    private void m88717o(C16654c.d dVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 12:
                    dVar.f84038o = m88695c0(trim);
                    break;
                case 13:
                    dVar.f84039p = m88695c0(trim);
                    break;
                case 14:
                    C16654c.p m88695c0 = m88695c0(trim);
                    dVar.f84040q = m88695c0;
                    if (m88695c0.m88531h()) {
                        throw new SAXException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    /* renamed from: o0 */
    private static C16654c.e0.d m88718o0(String str) {
        if ("miter".equals(str)) {
            return C16654c.e0.d.Miter;
        }
        if ("round".equals(str)) {
            return C16654c.e0.d.Round;
        }
        if ("bevel".equals(str)) {
            return C16654c.e0.d.Bevel;
        }
        throw new SAXException("Invalid stroke-linejoin property: " + str);
    }

    /* renamed from: p */
    private void m88719p(C16654c.e eVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            if (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    eVar.f84052p = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    eVar.f84052p = Boolean.TRUE;
                } else {
                    throw new SAXException("Invalid value for attribute clipPathUnits");
                }
            }
        }
    }

    /* renamed from: p0 */
    private static void m88720p0(C16654c.l0 l0Var, String str) {
        h hVar = new h(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String m88767r = hVar.m88767r(':');
            hVar.m88772w();
            if (hVar.m88754e(':')) {
                hVar.m88772w();
                String m88767r2 = hVar.m88767r(';');
                if (m88767r2 == null) {
                    return;
                }
                hVar.m88772w();
                if (hVar.m88756g() || hVar.m88754e(';')) {
                    if (l0Var.f84164f == null) {
                        l0Var.f84164f = new C16654c.e0();
                    }
                    m88651B0(l0Var.f84164f, m88767r, m88767r2);
                    hVar.m88772w();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    private void m88721q(C16654c.g0 g0Var, Attributes attributes) {
        HashSet hashSet;
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 21:
                    g0Var.mo88516f(m88711k0(trim));
                    break;
                case 22:
                    g0Var.mo88520k(trim);
                    break;
                case 23:
                    g0Var.mo88518h(m88722q0(trim));
                    break;
                case 24:
                    g0Var.mo88519i(m88713l0(trim));
                    break;
                case 25:
                    List m88686W = m88686W(trim);
                    if (m88686W != null) {
                        hashSet = new HashSet(m88686W);
                    } else {
                        hashSet = new HashSet(0);
                    }
                    g0Var.mo88515d(hashSet);
                    break;
            }
        }
    }

    /* renamed from: q0 */
    private static Set m88722q0(String str) {
        h hVar = new h(str);
        HashSet hashSet = new HashSet();
        while (!hVar.m88756g()) {
            String m88766q = hVar.m88766q();
            int indexOf = m88766q.indexOf(45);
            if (indexOf != -1) {
                m88766q = m88766q.substring(0, indexOf);
            }
            hashSet.add(new Locale(m88766q, "", "").getLanguage());
            hVar.m88772w();
        }
        return hashSet;
    }

    /* renamed from: r */
    private void m88723r(C16654c.l0 l0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String qName = attributes.getQName(i11);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i11).trim();
                    if ("default".equals(trim)) {
                        l0Var.f84162d = Boolean.FALSE;
                        return;
                    } else {
                        if ("preserve".equals(trim)) {
                            l0Var.f84162d = Boolean.TRUE;
                            return;
                        }
                        throw new SAXException("Invalid value for \"xml:space\" attribute: " + trim);
                    }
                }
            } else {
                l0Var.f84161c = attributes.getValue(i11).trim();
                return;
            }
        }
    }

    /* renamed from: r0 */
    private static C16654c.e0.e m88724r0(String str) {
        if ("start".equals(str)) {
            return C16654c.e0.e.Start;
        }
        if ("middle".equals(str)) {
            return C16654c.e0.e.Middle;
        }
        if ("end".equals(str)) {
            return C16654c.e0.e.End;
        }
        throw new SAXException("Invalid text-anchor property: " + str);
    }

    /* renamed from: s */
    private void m88725s(C16654c.i iVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 10:
                    C16654c.p m88695c0 = m88695c0(trim);
                    iVar.f84143q = m88695c0;
                    if (m88695c0.m88531h()) {
                        throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    C16654c.p m88695c02 = m88695c0(trim);
                    iVar.f84144r = m88695c02;
                    if (m88695c02.m88531h()) {
                        throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    iVar.f84141o = m88695c0(trim);
                    break;
                case 13:
                    iVar.f84142p = m88695c0(trim);
                    break;
            }
        }
    }

    /* renamed from: s0 */
    private static C16654c.e0.f m88726s0(String str) {
        if ("none".equals(str)) {
            return C16654c.e0.f.None;
        }
        if ("underline".equals(str)) {
            return C16654c.e0.f.Underline;
        }
        if ("overline".equals(str)) {
            return C16654c.e0.f.Overline;
        }
        if ("line-through".equals(str)) {
            return C16654c.e0.f.LineThrough;
        }
        if ("blink".equals(str)) {
            return C16654c.e0.f.Blink;
        }
        throw new SAXException("Invalid text-decoration property: " + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:            continue;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m88727t(C16654c.j jVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 6) {
                switch (i12) {
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        if ("objectBoundingBox".equals(trim)) {
                            jVar.f84151i = Boolean.FALSE;
                            break;
                        } else if ("userSpaceOnUse".equals(trim)) {
                            jVar.f84151i = Boolean.TRUE;
                            break;
                        } else {
                            throw new SAXException("Invalid value for attribute gradientUnits");
                        }
                    case 33:
                        jVar.f84152j = m88730u0(trim);
                        break;
                    case 34:
                        try {
                            jVar.f84153k = C16654c.k.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                }
            } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                jVar.f84154l = trim;
            }
        }
    }

    /* renamed from: t0 */
    private static C16654c.e0.g m88728t0(String str) {
        if ("ltr".equals(str)) {
            return C16654c.e0.g.LTR;
        }
        if ("rtl".equals(str)) {
            return C16654c.e0.g.RTL;
        }
        throw new SAXException("Invalid direction property: " + str);
    }

    /* renamed from: u */
    private void m88729u(C16654c.o oVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 6) {
                                if (i12 == 7) {
                                    m88709j0(oVar, trim);
                                }
                            } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i11))) {
                                oVar.f84173p = trim;
                            }
                        } else {
                            C16654c.p m88695c0 = m88695c0(trim);
                            oVar.f84177t = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <use> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c02 = m88695c0(trim);
                        oVar.f84176s = m88695c02;
                        if (m88695c02.m88531h()) {
                            throw new SAXException("Invalid <use> element. width cannot be negative");
                        }
                    }
                } else {
                    oVar.f84175r = m88695c0(trim);
                }
            } else {
                oVar.f84174q = m88695c0(trim);
            }
        }
    }

    /* renamed from: u0 */
    private Matrix m88730u0(String str) {
        Matrix matrix = new Matrix();
        h hVar = new h(str);
        hVar.m88772w();
        while (!hVar.m88756g()) {
            String m88763n = hVar.m88763n();
            if (m88763n != null) {
                if (m88763n.equals("matrix")) {
                    hVar.m88772w();
                    float m88762m = hVar.m88762m();
                    hVar.m88771v();
                    float m88762m2 = hVar.m88762m();
                    hVar.m88771v();
                    float m88762m3 = hVar.m88762m();
                    hVar.m88771v();
                    float m88762m4 = hVar.m88762m();
                    hVar.m88771v();
                    float m88762m5 = hVar.m88762m();
                    hVar.m88771v();
                    float m88762m6 = hVar.m88762m();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m6) && hVar.m88754e(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{m88762m, m88762m3, m88762m5, m88762m2, m88762m4, m88762m6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else if (m88763n.equals("translate")) {
                    hVar.m88772w();
                    float m88762m7 = hVar.m88762m();
                    float m88769t = hVar.m88769t();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m7) && hVar.m88754e(')')) {
                        if (Float.isNaN(m88769t)) {
                            matrix.preTranslate(m88762m7, 0.0f);
                        } else {
                            matrix.preTranslate(m88762m7, m88769t);
                        }
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else if (m88763n.equals("scale")) {
                    hVar.m88772w();
                    float m88762m8 = hVar.m88762m();
                    float m88769t2 = hVar.m88769t();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m8) && hVar.m88754e(')')) {
                        if (Float.isNaN(m88769t2)) {
                            matrix.preScale(m88762m8, m88762m8);
                        } else {
                            matrix.preScale(m88762m8, m88769t2);
                        }
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else if (m88763n.equals("rotate")) {
                    hVar.m88772w();
                    float m88762m9 = hVar.m88762m();
                    float m88769t3 = hVar.m88769t();
                    float m88769t4 = hVar.m88769t();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m9) && hVar.m88754e(')')) {
                        if (Float.isNaN(m88769t3)) {
                            matrix.preRotate(m88762m9);
                        } else if (!Float.isNaN(m88769t4)) {
                            matrix.preRotate(m88762m9, m88769t3, m88769t4);
                        } else {
                            throw new SAXException("Invalid transform list: " + str);
                        }
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else if (m88763n.equals("skewX")) {
                    hVar.m88772w();
                    float m88762m10 = hVar.m88762m();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m10) && hVar.m88754e(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(m88762m10)), 0.0f);
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else if (m88763n.equals("skewY")) {
                    hVar.m88772w();
                    float m88762m11 = hVar.m88762m();
                    hVar.m88772w();
                    if (!Float.isNaN(m88762m11) && hVar.m88754e(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(m88762m11)));
                    } else {
                        throw new SAXException("Invalid transform list: " + str);
                    }
                } else {
                    throw new SAXException("Invalid transform list fn: " + m88763n + ")");
                }
                if (hVar.m88756g()) {
                    break;
                }
                hVar.m88771v();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: " + str);
            }
        }
        return matrix;
    }

    /* renamed from: v */
    private void m88731v(C16654c.q qVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    qVar.f84182o = m88695c0(trim);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    qVar.f84183p = m88695c0(trim);
                    break;
                case 17:
                    qVar.f84184q = m88695c0(trim);
                    break;
                case 18:
                    qVar.f84185r = m88695c0(trim);
                    break;
            }
        }
    }

    /* renamed from: v0 */
    private static C16654c.e0.h m88732v0(String str) {
        if ("none".equals(str)) {
            return C16654c.e0.h.None;
        }
        if ("non-scaling-stroke".equals(str)) {
            return C16654c.e0.h.NonScalingStroke;
        }
        throw new SAXException("Invalid vector-effect property: " + str);
    }

    /* renamed from: w */
    private void m88733w(C16654c.m0 m0Var, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 15:
                    m0Var.f84167m = m88695c0(trim);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    m0Var.f84168n = m88695c0(trim);
                    break;
                case 17:
                    m0Var.f84169o = m88695c0(trim);
                    break;
                case 18:
                    m0Var.f84170p = m88695c0(trim);
                    break;
            }
        }
    }

    /* renamed from: w0 */
    private static C16654c.b m88734w0(String str) {
        h hVar = new h(str);
        hVar.m88772w();
        float m88762m = hVar.m88762m();
        hVar.m88771v();
        float m88762m2 = hVar.m88762m();
        hVar.m88771v();
        float m88762m3 = hVar.m88762m();
        hVar.m88771v();
        float m88762m4 = hVar.m88762m();
        if (!Float.isNaN(m88762m) && !Float.isNaN(m88762m2) && !Float.isNaN(m88762m3) && !Float.isNaN(m88762m4)) {
            if (m88762m3 >= 0.0f) {
                if (m88762m4 >= 0.0f) {
                    return new C16654c.b(m88762m, m88762m2, m88762m3, m88762m4);
                }
                throw new SAXException("Invalid viewBox. height cannot be negative");
            }
            throw new SAXException("Invalid viewBox. width cannot be negative");
        }
        throw new SAXException("Invalid viewBox definition - should have four numbers");
    }

    /* renamed from: x */
    private void m88735x(C16654c.r rVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            switch (a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()]) {
                case 26:
                    rVar.f84192r = m88695c0(trim);
                    break;
                case 27:
                    rVar.f84193s = m88695c0(trim);
                    break;
                case 28:
                    C16654c.p m88695c0 = m88695c0(trim);
                    rVar.f84194t = m88695c0;
                    if (m88695c0.m88531h()) {
                        throw new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    C16654c.p m88695c02 = m88695c0(trim);
                    rVar.f84195u = m88695c02;
                    if (m88695c02.m88531h()) {
                        throw new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    if ("strokeWidth".equals(trim)) {
                        rVar.f84191q = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        rVar.f84191q = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute markerUnits");
                    }
                case 31:
                    if ("auto".equals(trim)) {
                        rVar.f84196v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        rVar.f84196v = Float.valueOf(m88683T(trim));
                        break;
                    }
            }
        }
    }

    /* renamed from: x0 */
    private void m88736x0(Attributes attributes) {
        m88696d("<path>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.v vVar = new C16654c.v();
            vVar.f84171a = this.f84284a;
            vVar.f84172b = this.f84285b;
            m88723r(vVar, attributes);
            m88660G(vVar, attributes);
            m88668K(vVar, attributes);
            m88721q(vVar, attributes);
            m88739z(vVar, attributes);
            this.f84285b.mo88499j(vVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: y */
    private void m88737y(C16654c.s sVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 43) {
                                if (i12 != 44) {
                                    continue;
                                } else if ("objectBoundingBox".equals(trim)) {
                                    sVar.f84199p = Boolean.FALSE;
                                } else if ("userSpaceOnUse".equals(trim)) {
                                    sVar.f84199p = Boolean.TRUE;
                                } else {
                                    throw new SAXException("Invalid value for attribute maskContentUnits");
                                }
                            } else if ("objectBoundingBox".equals(trim)) {
                                sVar.f84198o = Boolean.FALSE;
                            } else if ("userSpaceOnUse".equals(trim)) {
                                sVar.f84198o = Boolean.TRUE;
                            } else {
                                throw new SAXException("Invalid value for attribute maskUnits");
                            }
                        } else {
                            C16654c.p m88695c0 = m88695c0(trim);
                            sVar.f84203t = m88695c0;
                            if (m88695c0.m88531h()) {
                                throw new SAXException("Invalid <mask> element. height cannot be negative");
                            }
                        }
                    } else {
                        C16654c.p m88695c02 = m88695c0(trim);
                        sVar.f84202s = m88695c02;
                        if (m88695c02.m88531h()) {
                            throw new SAXException("Invalid <mask> element. width cannot be negative");
                        }
                    }
                } else {
                    sVar.f84201r = m88695c0(trim);
                }
            } else {
                sVar.f84200q = m88695c0(trim);
            }
        }
    }

    /* renamed from: y0 */
    private void m88738y0(Attributes attributes) {
        m88696d("<pattern>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.y yVar = new C16654c.y();
            yVar.f84171a = this.f84284a;
            yVar.f84172b = this.f84285b;
            m88723r(yVar, attributes);
            m88660G(yVar, attributes);
            m88721q(yVar, attributes);
            m88672M(yVar, attributes);
            m88648A(yVar, attributes);
            this.f84285b.mo88499j(yVar);
            this.f84285b = yVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: z */
    private void m88739z(C16654c.v vVar, Attributes attributes) {
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            String trim = attributes.getValue(i11).trim();
            int i12 = a.f84295b[f.m88747c(attributes.getLocalName(i11)).ordinal()];
            if (i12 != 8) {
                if (i12 != 9) {
                    continue;
                } else {
                    Float valueOf = Float.valueOf(m88683T(trim));
                    vVar.f84209p = valueOf;
                    if (valueOf.floatValue() < 0.0f) {
                        throw new SAXException("Invalid <path> element. pathLength cannot be negative");
                    }
                }
            } else {
                vVar.f84208o = m88707i0(trim);
            }
        }
    }

    /* renamed from: z0 */
    private void m88740z0(Attributes attributes) {
        m88696d("<polygon>", new Object[0]);
        if (this.f84285b != null) {
            C16654c.z a0Var = new C16654c.a0();
            a0Var.f84171a = this.f84284a;
            a0Var.f84172b = this.f84285b;
            m88723r(a0Var, attributes);
            m88660G(a0Var, attributes);
            m88668K(a0Var, attributes);
            m88721q(a0Var, attributes);
            m88650B(a0Var, attributes, "polygon");
            this.f84285b.mo88499j(a0Var);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i11, int i12) {
        C16654c.n0 n0Var;
        if (this.f84286c) {
            return;
        }
        if (this.f84288e) {
            if (this.f84290g == null) {
                this.f84290g = new StringBuilder(i12);
            }
            this.f84290g.append(cArr, i11, i12);
            return;
        }
        if (this.f84291h) {
            if (this.f84292i == null) {
                this.f84292i = new StringBuilder(i12);
            }
            this.f84292i.append(cArr, i11, i12);
            return;
        }
        C16654c.j0 j0Var = this.f84285b;
        if (j0Var instanceof C16654c.y0) {
            C16654c.h0 h0Var = (C16654c.h0) j0Var;
            int size = h0Var.f84135i.size();
            if (size == 0) {
                n0Var = null;
            } else {
                n0Var = (C16654c.n0) h0Var.f84135i.get(size - 1);
            }
            if (n0Var instanceof C16654c.c1) {
                StringBuilder sb2 = new StringBuilder();
                C16654c.c1 c1Var = (C16654c.c1) n0Var;
                sb2.append(c1Var.f84036c);
                sb2.append(new String(cArr, i11, i12));
                c1Var.f84036c = sb2.toString();
                return;
            }
            this.f84285b.mo88499j(new C16654c.c1(new String(cArr, i11, i12)));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i11, int i12) {
        if (!this.f84286c && this.f84291h) {
            if (this.f84292i == null) {
                this.f84292i = new StringBuilder(i12);
            }
            this.f84292i.append(cArr, i11, i12);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (this.f84286c) {
            int i11 = this.f84287d - 1;
            this.f84287d = i11;
            if (i11 == 0) {
                this.f84286c = false;
                return;
            }
        }
        if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
            return;
        }
        int i12 = a.f84294a[g.m88749c(str2).ordinal()];
        if (i12 != 1 && i12 != 2 && i12 != 4 && i12 != 5 && i12 != 13 && i12 != 14) {
            switch (i12) {
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31:
                    break;
                case 22:
                case 23:
                    this.f84288e = false;
                    StringBuilder sb2 = this.f84290g;
                    if (sb2 != null) {
                        g gVar = this.f84289f;
                        if (gVar == g.title) {
                            this.f84284a.m88493n(sb2.toString());
                        } else if (gVar == g.desc) {
                            this.f84284a.m88491l(sb2.toString());
                        }
                        this.f84290g.setLength(0);
                        return;
                    }
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    StringBuilder sb3 = this.f84292i;
                    if (sb3 != null) {
                        this.f84291h = false;
                        m88674N(sb3.toString());
                        this.f84292i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.f84285b = ((C16654c.n0) this.f84285b).f84172b;
    }

    /* renamed from: n */
    public C16654c m88741n(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        try {
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        } catch (ParserConfigurationException | SAXNotRecognizedException | SAXNotSupportedException unused2) {
        }
        try {
            try {
                try {
                    XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                    xMLReader.setContentHandler(this);
                    xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                    xMLReader.parse(new InputSource(inputStream));
                    return this.f84284a;
                } catch (ParserConfigurationException e11) {
                    throw new SVGParseException("XML Parser problem", e11);
                } catch (SAXException e12) {
                    throw new SVGParseException("SVG parse error: " + e12.getMessage(), e12);
                }
            } catch (IOException e13) {
                throw new SVGParseException("File error", e13);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
        this.f84284a = new C16654c();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.f84286c) {
            this.f84287d++;
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str)) {
            return;
        }
        g m88749c = g.m88749c(str2);
        switch (a.f84294a[m88749c.ordinal()]) {
            case 1:
                m88663H0(attributes);
                return;
            case 2:
            case 3:
                m88704h(attributes);
                return;
            case 4:
                m88698e(attributes);
                return;
            case 5:
                m88675N0(attributes);
                return;
            case 6:
                m88736x0(attributes);
                return;
            case 7:
                m88655D0(attributes);
                return;
            case 8:
                m88690a(attributes);
                return;
            case 9:
                m88700f(attributes);
                return;
            case 10:
                m88708j(attributes);
                return;
            case 11:
                m88649A0(attributes);
                return;
            case 12:
                m88740z0(attributes);
                return;
            case 13:
                m88667J0(attributes);
                return;
            case 14:
                m88673M0(attributes);
                return;
            case 15:
                m88671L0(attributes);
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                m88679P0(attributes);
                return;
            case 17:
                m88665I0(attributes);
                return;
            case 18:
                m88712l(attributes);
                return;
            case 19:
                m88710k(attributes);
                return;
            case 20:
                m88653C0(attributes);
                return;
            case 21:
                m88659F0(attributes);
                return;
            case 22:
            case 23:
                this.f84288e = true;
                this.f84289f = m88749c;
                return;
            case 24:
                m88694c(attributes);
                return;
            case 25:
                m88669K0(attributes);
                return;
            case 26:
                m88738y0(attributes);
                return;
            case 27:
                m88706i(attributes);
                return;
            case 28:
                m88677O0(attributes);
                return;
            case 29:
                m88714m(attributes);
                return;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                m88661G0(attributes);
                return;
            case 31:
                m88657E0(attributes);
                return;
            default:
                this.f84286c = true;
                this.f84287d = 1;
                return;
        }
    }
}

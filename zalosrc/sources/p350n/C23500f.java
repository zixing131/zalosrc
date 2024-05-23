package p350n;

import android.content.Context;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p250j.C20894a;
import p283k.AbstractC21420a;
import p283k.AbstractC21421b;
import p375o.C23970a;
import p375o.C23971b;

/* renamed from: n.f */
/* loaded from: classes2.dex */
public class C23500f extends DefaultHandler {

    /* renamed from: A */
    private List f114102A;

    /* renamed from: B */
    private List f114103B;

    /* renamed from: C */
    private List f114104C;

    /* renamed from: D */
    private C20894a f114105D;

    /* renamed from: I */
    private String f114110I;

    /* renamed from: J */
    private String f114111J;

    /* renamed from: K */
    private String f114112K;

    /* renamed from: a */
    private Context f114113a;

    /* renamed from: b */
    private SAXParserFactory f114114b;

    /* renamed from: c */
    private SAXParser f114115c;

    /* renamed from: d */
    private String f114116d;

    /* renamed from: e */
    private C23498d f114117e;

    /* renamed from: i */
    private C23971b f114121i;

    /* renamed from: j */
    private List f114122j;

    /* renamed from: l */
    private List f114124l;

    /* renamed from: m */
    private List f114125m;

    /* renamed from: o */
    private HashMap f114127o;

    /* renamed from: p */
    private HashMap f114128p;

    /* renamed from: q */
    private List f114129q;

    /* renamed from: r */
    private List f114130r;

    /* renamed from: s */
    private List f114131s;

    /* renamed from: t */
    private List f114132t;

    /* renamed from: u */
    private List f114133u;

    /* renamed from: v */
    private List f114134v;

    /* renamed from: w */
    private List f114135w;

    /* renamed from: x */
    private List f114136x;

    /* renamed from: y */
    private List f114137y;

    /* renamed from: z */
    private List f114138z;

    /* renamed from: f */
    private String f114118f = null;

    /* renamed from: g */
    private List f114119g = null;

    /* renamed from: h */
    private C23970a f114120h = null;

    /* renamed from: k */
    private List f114123k = null;

    /* renamed from: n */
    private String f114126n = null;

    /* renamed from: E */
    private int f114106E = 0;

    /* renamed from: F */
    private StringBuilder f114107F = new StringBuilder(64);

    /* renamed from: G */
    private int f114108G = 0;

    /* renamed from: H */
    private int f114109H = 1;

    public C23500f(Context context, String str, String str2, String str3) {
        this.f114113a = context;
        this.f114110I = str;
        this.f114111J = str2;
        this.f114112K = str3;
    }

    /* renamed from: c */
    private void m123365c(String str, int i11) {
        StringBuilder sb2;
        String message;
        try {
            if (i11 >= 5) {
                AbstractC21420a.m110923c("VASTSAXParser", "VAST wrapping exceeded max limit of 5.");
                this.f114108G = 5;
                return;
            }
            if (this.f114114b == null) {
                this.f114114b = SAXParserFactory.newInstance();
            }
            if (this.f114115c == null) {
                this.f114115c = this.f114114b.newSAXParser();
            }
            this.f114115c.parse(m123368b(str), this);
        } catch (IOException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("VASTSAXParser", sb2.toString());
            this.f114108G = 2;
        } catch (ParserConfigurationException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("VASTSAXParser", sb2.toString());
            this.f114108G = 2;
        } catch (SAXException e13) {
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e13.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("VASTSAXParser", sb2.toString());
            this.f114108G = 2;
        }
    }

    /* renamed from: e */
    private void m123366e() {
        try {
            this.f114117e = new C23498d();
            this.f114123k = new ArrayList();
            this.f114124l = new ArrayList();
            this.f114125m = new ArrayList();
            this.f114127o = new HashMap();
            this.f114128p = new HashMap();
            this.f114121i = new C23971b();
            this.f114129q = new ArrayList();
            this.f114130r = new ArrayList();
            this.f114131s = new ArrayList();
            this.f114132t = new ArrayList();
            this.f114133u = new ArrayList();
            this.f114134v = new ArrayList();
            this.f114135w = new ArrayList();
            this.f114136x = new ArrayList();
            this.f114137y = new ArrayList();
            this.f114138z = new ArrayList();
            this.f114102A = new ArrayList();
            this.f114103B = new ArrayList();
            this.f114104C = new ArrayList();
            this.f114122j = new ArrayList();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public int m123367a() {
        return this.f114108G;
    }

    /* renamed from: b */
    public String m123368b(String str) {
        if (str == null) {
            return str;
        }
        try {
            if (str.length() != 0 && str.contains("__TIME_STAMP__") && str.contains("__IDFA__") && str.contains("__APP_SET_ID__") && str.contains("__LIMIT_AD_TRACKING__")) {
                return str.replace("__TIME_STAMP__", String.valueOf(System.currentTimeMillis())).replace("__IDFA__", this.f114111J).replace("__APP_SET_ID__", this.f114110I).replace("__LIMIT_AD_TRACKING__", this.f114112K);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i11, int i12) {
        try {
            this.f114107F.append(new String(cArr, i11, i12));
        } catch (Exception e11) {
            AbstractC21420a.m110923c("VASTSAXParser", "parse Error: " + e11.getMessage());
            this.f114108G = 2;
        }
    }

    /* renamed from: d */
    public C23498d m123369d(String str) {
        try {
            m123366e();
            m123365c(str, this.f114109H);
            if (this.f114108G == 0) {
                this.f114117e.m123343c(this.f114126n);
                String str2 = this.f114126n;
                if (str2 != null && str2.length() != 0) {
                    this.f114117e.m123342b(AbstractC21421b.m110926a(this.f114126n));
                }
                this.f114117e.m123351k(this.f114125m);
                this.f114117e.m123344d(this.f114127o);
                this.f114117e.m123347g(this.f114121i);
                this.f114117e.m123350j(this.f114128p);
                this.f114117e.m123353m(this.f114124l);
                this.f114117e.m123355o(this.f114119g);
                List list = this.f114119g;
                if (list != null && list.size() > 0) {
                    this.f114117e.m123346f(new C23497c(this.f114113a).m123339e(this.f114119g));
                }
                this.f114117e.m123345e(this.f114122j);
                return this.f114117e;
            }
        } catch (Exception e11) {
            AbstractC21420a.m110923c("VASTSAXParser", "parseVast Error: " + e11.getMessage());
        }
        return null;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        List list;
        String sb2;
        Object obj;
        try {
            if (!str3.equalsIgnoreCase("VASTAdTagURI") && !str3.equalsIgnoreCase("DAASTAdTagURI")) {
                if (str3.equalsIgnoreCase("Impression")) {
                    list = this.f114124l;
                    sb2 = this.f114107F.toString();
                } else {
                    if (!str3.equalsIgnoreCase("Error")) {
                        if (str3.equalsIgnoreCase("Duration")) {
                            this.f114126n = this.f114107F.toString().trim();
                            return;
                        }
                        if (str3.equalsIgnoreCase("Verification")) {
                            list = this.f114122j;
                            obj = this.f114105D;
                        } else {
                            if (str3.equalsIgnoreCase("JavaScriptResource")) {
                                this.f114105D.m109333b(this.f114107F.toString().trim());
                                return;
                            }
                            if (str3.equalsIgnoreCase("VerificationParameters")) {
                                this.f114105D.m109332a(this.f114107F.toString().trim());
                                return;
                            }
                            if (!str3.equalsIgnoreCase("MediaFile")) {
                                if (!str3.equalsIgnoreCase("AdInteractions") && !str3.equalsIgnoreCase("VideoClicks")) {
                                    if (str3.equalsIgnoreCase("ClickThrough")) {
                                        this.f114121i.m125454c(this.f114107F.toString().trim());
                                        return;
                                    }
                                    if (str3.equalsIgnoreCase("ClickTracking")) {
                                        list = this.f114123k;
                                        sb2 = this.f114107F.toString();
                                    } else {
                                        if (str3.equalsIgnoreCase("TrackingEvents")) {
                                            this.f114127o.put(EnumC23496b.creativeView, this.f114129q);
                                            this.f114127o.put(EnumC23496b.start, this.f114130r);
                                            this.f114127o.put(EnumC23496b.firstQuartile, this.f114131s);
                                            this.f114127o.put(EnumC23496b.midpoint, this.f114132t);
                                            this.f114127o.put(EnumC23496b.thirdQuartile, this.f114133u);
                                            this.f114127o.put(EnumC23496b.complete, this.f114134v);
                                            this.f114127o.put(EnumC23496b.close, this.f114135w);
                                            this.f114127o.put(EnumC23496b.pause, this.f114136x);
                                            this.f114127o.put(EnumC23496b.resume, this.f114137y);
                                            this.f114127o.put(EnumC23496b.fullscreen, this.f114138z);
                                            this.f114127o.put(EnumC23496b.mute, this.f114102A);
                                            this.f114127o.put(EnumC23496b.unmute, this.f114103B);
                                            if (this.f114104C.size() > 0) {
                                                this.f114128p.put(Integer.valueOf(this.f114106E), this.f114104C);
                                                return;
                                            }
                                            return;
                                        }
                                        if (!str3.equalsIgnoreCase("Tracking")) {
                                            return;
                                        }
                                        if (this.f114116d.equals("creativeView")) {
                                            list = this.f114129q;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("start")) {
                                            list = this.f114130r;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("firstQuartile")) {
                                            list = this.f114131s;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("midpoint")) {
                                            list = this.f114132t;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("thirdQuartile")) {
                                            list = this.f114133u;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("complete")) {
                                            list = this.f114134v;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("close")) {
                                            list = this.f114135w;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("pause")) {
                                            list = this.f114136x;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("resume")) {
                                            list = this.f114137y;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("fullscreen")) {
                                            list = this.f114138z;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("mute")) {
                                            list = this.f114102A;
                                            sb2 = this.f114107F.toString();
                                        } else if (this.f114116d.equals("unmute")) {
                                            list = this.f114103B;
                                            sb2 = this.f114107F.toString();
                                        } else {
                                            if (!this.f114116d.equals("progress")) {
                                                return;
                                            }
                                            list = this.f114104C;
                                            sb2 = this.f114107F.toString();
                                        }
                                    }
                                }
                                this.f114121i.m125456e(this.f114123k);
                                return;
                            }
                            this.f114120h.m125451n(this.f114107F.toString().trim());
                            list = this.f114119g;
                            obj = this.f114120h;
                        }
                        list.add(obj);
                        return;
                    }
                    list = this.f114125m;
                    sb2 = this.f114107F.toString();
                }
                obj = sb2.trim();
                list.add(obj);
                return;
            }
            this.f114118f = this.f114107F.toString().trim();
            AbstractC21420a.m110923c("VASTSAXParser", str3 + ": " + this.f114118f);
            String str4 = this.f114118f;
            int i11 = this.f114109H;
            this.f114109H = i11 + 1;
            m123365c(str4, i11);
        } catch (Exception e11) {
            AbstractC21420a.m110923c("VASTSAXParser", "parse Error: " + e11.getMessage());
            this.f114108G = 2;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4;
        int m110927b;
        try {
            this.f114107F.setLength(0);
            if (str3.equalsIgnoreCase("MediaFiles")) {
                this.f114119g = new ArrayList();
                return;
            }
            if (str3.equalsIgnoreCase("MediaFile")) {
                C23970a c23970a = new C23970a();
                this.f114120h = c23970a;
                c23970a.m125440c(attributes.getValue("apiFramework"));
                String value = attributes.getValue("bitrate");
                if (value != null) {
                    this.f114120h.m125441d(new BigInteger(value));
                }
                this.f114120h.m125444g(attributes.getValue("delivery"));
                String value2 = attributes.getValue("height");
                if (value2 != null) {
                    this.f114120h.m125445h(new BigInteger(value2));
                }
                String value3 = attributes.getValue("width");
                if (value3 != null) {
                    this.f114120h.m125448k(new BigInteger(value3));
                }
                this.f114120h.m125447j(attributes.getValue("id"));
                String value4 = attributes.getValue("maintainAspectRatio");
                if (value4 != null) {
                    this.f114120h.m125439b(Boolean.valueOf(value4));
                }
                String value5 = attributes.getValue("scalable");
                if (value5 != null) {
                    this.f114120h.m125443f(Boolean.valueOf(value5));
                }
                this.f114120h.m125450m(attributes.getValue(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                return;
            }
            if (!str3.equalsIgnoreCase("AdInteractions") && !str3.equalsIgnoreCase("VideoClicks")) {
                if (str3.equalsIgnoreCase("Verification")) {
                    C20894a c20894a = new C20894a();
                    this.f114105D = c20894a;
                    c20894a.m109334c(attributes.getValue("vendor"));
                    return;
                }
                if (str3.equalsIgnoreCase("Tracking")) {
                    String value6 = attributes.getValue("event");
                    this.f114116d = value6;
                    if (value6.equals("progress")) {
                        this.f114106E = 0;
                        String value7 = attributes.getValue("offset");
                        if (value7 == null || value7.length() == 0) {
                            return;
                        }
                        if (value7.contains(":")) {
                            m110927b = AbstractC21421b.m110926a(value7);
                        } else if (!value7.contains("%") || (str4 = this.f114126n) == null) {
                            return;
                        } else {
                            m110927b = AbstractC21421b.m110927b(str4, value7);
                        }
                        this.f114106E = m110927b;
                        return;
                    }
                    return;
                }
                return;
            }
            this.f114123k = new ArrayList();
        } catch (Exception e11) {
            AbstractC21420a.m110923c("VASTSAXParser", "parse Error: " + e11.getMessage());
            this.f114108G = 2;
        }
    }
}

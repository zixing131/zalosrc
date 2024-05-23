package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes2.dex */
public class C1294b {

    /* renamed from: a */
    private final ConstraintLayout f5613a;

    /* renamed from: b */
    C1295c f5614b;

    /* renamed from: c */
    int f5615c = -1;

    /* renamed from: d */
    int f5616d = -1;

    /* renamed from: e */
    private SparseArray f5617e = new SparseArray();

    /* renamed from: f */
    private SparseArray f5618f = new SparseArray();

    /* renamed from: androidx.constraintlayout.widget.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        int f5619a;

        /* renamed from: b */
        ArrayList f5620b = new ArrayList();

        /* renamed from: c */
        int f5621c;

        /* renamed from: d */
        C1295c f5622d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f5621c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.State_android_id) {
                    this.f5619a = obtainStyledAttributes.getResourceId(index, this.f5619a);
                } else if (index == AbstractC1298f.State_constraints) {
                    this.f5621c = obtainStyledAttributes.getResourceId(index, this.f5621c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5621c);
                    context.getResources().getResourceName(this.f5621c);
                    if ("layout".equals(resourceTypeName)) {
                        C1295c c1295c = new C1295c();
                        this.f5622d = c1295c;
                        c1295c.m6455o(context, this.f5621c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m6416a(b bVar) {
            this.f5620b.add(bVar);
        }

        /* renamed from: b */
        public int m6417b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f5620b.size(); i11++) {
                if (((b) this.f5620b.get(i11)).m6418a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        float f5623a;

        /* renamed from: b */
        float f5624b;

        /* renamed from: c */
        float f5625c;

        /* renamed from: d */
        float f5626d;

        /* renamed from: e */
        int f5627e;

        /* renamed from: f */
        C1295c f5628f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f5623a = Float.NaN;
            this.f5624b = Float.NaN;
            this.f5625c = Float.NaN;
            this.f5626d = Float.NaN;
            this.f5627e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.Variant_constraints) {
                    this.f5627e = obtainStyledAttributes.getResourceId(index, this.f5627e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5627e);
                    context.getResources().getResourceName(this.f5627e);
                    if ("layout".equals(resourceTypeName)) {
                        C1295c c1295c = new C1295c();
                        this.f5628f = c1295c;
                        c1295c.m6455o(context, this.f5627e);
                    }
                } else if (index == AbstractC1298f.Variant_region_heightLessThan) {
                    this.f5626d = obtainStyledAttributes.getDimension(index, this.f5626d);
                } else if (index == AbstractC1298f.Variant_region_heightMoreThan) {
                    this.f5624b = obtainStyledAttributes.getDimension(index, this.f5624b);
                } else if (index == AbstractC1298f.Variant_region_widthLessThan) {
                    this.f5625c = obtainStyledAttributes.getDimension(index, this.f5625c);
                } else if (index == AbstractC1298f.Variant_region_widthMoreThan) {
                    this.f5623a = obtainStyledAttributes.getDimension(index, this.f5623a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m6418a(float f11, float f12) {
            if (!Float.isNaN(this.f5623a) && f11 < this.f5623a) {
                return false;
            }
            if (!Float.isNaN(this.f5624b) && f12 < this.f5624b) {
                return false;
            }
            if (!Float.isNaN(this.f5625c) && f11 > this.f5625c) {
                return false;
            }
            if (!Float.isNaN(this.f5626d) && f12 > this.f5626d) {
                return false;
            }
            return true;
        }
    }

    public C1294b(Context context, ConstraintLayout constraintLayout, int i11) {
        this.f5613a = constraintLayout;
        m6412a(context, i11);
    }

    /* renamed from: a */
    private void m6412a(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c11 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            if (c11 != 2) {
                                if (c11 != 3) {
                                    if (c11 == 4) {
                                        m6413b(context, xml);
                                    }
                                } else {
                                    b bVar = new b(context, xml);
                                    if (aVar != null) {
                                        aVar.m6416a(bVar);
                                    }
                                }
                            } else {
                                aVar = new a(context, xml);
                                this.f5617e.put(aVar.f5619a, aVar);
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m6413b(Context context, XmlPullParser xmlPullParser) {
        int i11;
        C1295c c1295c = new C1295c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeName = xmlPullParser.getAttributeName(i12);
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i11 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i11 = -1;
                }
                if (i11 == -1 && attributeValue.length() > 1) {
                    i11 = Integer.parseInt(attributeValue.substring(1));
                }
                c1295c.m6443E(context, xmlPullParser);
                this.f5618f.put(i11, c1295c);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m6414c(AbstractC1296d abstractC1296d) {
    }

    /* renamed from: d */
    public void m6415d(int i11, float f11, float f12) {
        C1295c c1295c;
        a aVar;
        int m6417b;
        C1295c c1295c2;
        int i12 = this.f5615c;
        if (i12 == i11) {
            if (i11 == -1) {
                aVar = (a) this.f5617e.valueAt(0);
            } else {
                aVar = (a) this.f5617e.get(i12);
            }
            int i13 = this.f5616d;
            if ((i13 != -1 && ((b) aVar.f5620b.get(i13)).m6418a(f11, f12)) || this.f5616d == (m6417b = aVar.m6417b(f11, f12))) {
                return;
            }
            if (m6417b == -1) {
                c1295c2 = this.f5614b;
            } else {
                c1295c2 = ((b) aVar.f5620b.get(m6417b)).f5628f;
            }
            if (m6417b != -1) {
                int i14 = ((b) aVar.f5620b.get(m6417b)).f5627e;
            }
            if (c1295c2 == null) {
                return;
            }
            this.f5616d = m6417b;
            c1295c2.m6450i(this.f5613a);
            return;
        }
        this.f5615c = i11;
        a aVar2 = (a) this.f5617e.get(i11);
        int m6417b2 = aVar2.m6417b(f11, f12);
        if (m6417b2 == -1) {
            c1295c = aVar2.f5622d;
        } else {
            c1295c = ((b) aVar2.f5620b.get(m6417b2)).f5628f;
        }
        if (m6417b2 != -1) {
            int i15 = ((b) aVar2.f5620b.get(m6417b2)).f5627e;
        }
        if (c1295c == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NO Constraint set found ! id=");
            sb2.append(i11);
            sb2.append(", dim =");
            sb2.append(f11);
            sb2.append(", ");
            sb2.append(f12);
            return;
        }
        this.f5616d = m6417b2;
        c1295c.m6450i(this.f5613a);
    }
}

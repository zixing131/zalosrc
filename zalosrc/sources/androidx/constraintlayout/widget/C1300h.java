package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.h */
/* loaded from: classes2.dex */
public class C1300h {

    /* renamed from: a */
    int f5770a = -1;

    /* renamed from: b */
    int f5771b = -1;

    /* renamed from: c */
    int f5772c = -1;

    /* renamed from: d */
    private SparseArray f5773d = new SparseArray();

    /* renamed from: e */
    private SparseArray f5774e = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.h$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        int f5775a;

        /* renamed from: b */
        ArrayList f5776b = new ArrayList();

        /* renamed from: c */
        int f5777c;

        /* renamed from: d */
        boolean f5778d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f5777c = -1;
            this.f5778d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.State_android_id) {
                    this.f5775a = obtainStyledAttributes.getResourceId(index, this.f5775a);
                } else if (index == AbstractC1298f.State_constraints) {
                    this.f5777c = obtainStyledAttributes.getResourceId(index, this.f5777c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5777c);
                    context.getResources().getResourceName(this.f5777c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f5778d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m6492a(b bVar) {
            this.f5776b.add(bVar);
        }

        /* renamed from: b */
        public int m6493b(float f11, float f12) {
            for (int i11 = 0; i11 < this.f5776b.size(); i11++) {
                if (((b) this.f5776b.get(i11)).m6494a(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.h$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        float f5779a;

        /* renamed from: b */
        float f5780b;

        /* renamed from: c */
        float f5781c;

        /* renamed from: d */
        float f5782d;

        /* renamed from: e */
        int f5783e;

        /* renamed from: f */
        boolean f5784f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f5779a = Float.NaN;
            this.f5780b = Float.NaN;
            this.f5781c = Float.NaN;
            this.f5782d = Float.NaN;
            this.f5783e = -1;
            this.f5784f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.Variant_constraints) {
                    this.f5783e = obtainStyledAttributes.getResourceId(index, this.f5783e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5783e);
                    context.getResources().getResourceName(this.f5783e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f5784f = true;
                    }
                } else if (index == AbstractC1298f.Variant_region_heightLessThan) {
                    this.f5782d = obtainStyledAttributes.getDimension(index, this.f5782d);
                } else if (index == AbstractC1298f.Variant_region_heightMoreThan) {
                    this.f5780b = obtainStyledAttributes.getDimension(index, this.f5780b);
                } else if (index == AbstractC1298f.Variant_region_widthLessThan) {
                    this.f5781c = obtainStyledAttributes.getDimension(index, this.f5781c);
                } else if (index == AbstractC1298f.Variant_region_widthMoreThan) {
                    this.f5779a = obtainStyledAttributes.getDimension(index, this.f5779a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m6494a(float f11, float f12) {
            if (!Float.isNaN(this.f5779a) && f11 < this.f5779a) {
                return false;
            }
            if (!Float.isNaN(this.f5780b) && f12 < this.f5780b) {
                return false;
            }
            if (!Float.isNaN(this.f5781c) && f11 > this.f5781c) {
                return false;
            }
            if (!Float.isNaN(this.f5782d) && f12 > this.f5782d) {
                return false;
            }
            return true;
        }
    }

    public C1300h(Context context, XmlPullParser xmlPullParser) {
        m6488b(context, xmlPullParser);
    }

    /* renamed from: b */
    private void m6488b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == AbstractC1298f.StateSet_defaultState) {
                this.f5770a = obtainStyledAttributes.getResourceId(index, this.f5770a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                char c11 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
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
                                if (c11 == 3) {
                                    b bVar = new b(context, xmlPullParser);
                                    if (aVar != null) {
                                        aVar.m6492a(bVar);
                                    }
                                }
                            } else {
                                aVar = new a(context, xmlPullParser);
                                this.f5773d.put(aVar.f5775a, aVar);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
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

    /* renamed from: a */
    public int m6489a(int i11, int i12, float f11, float f12) {
        a aVar = (a) this.f5773d.get(i12);
        if (aVar == null) {
            return i12;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            Iterator it = aVar.f5776b.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if (bVar2.m6494a(f11, f12)) {
                    if (i11 == bVar2.f5783e) {
                        return i11;
                    }
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                return bVar.f5783e;
            }
            return aVar.f5777c;
        }
        if (aVar.f5777c == i11) {
            return i11;
        }
        Iterator it2 = aVar.f5776b.iterator();
        while (it2.hasNext()) {
            if (i11 == ((b) it2.next()).f5783e) {
                return i11;
            }
        }
        return aVar.f5777c;
    }

    /* renamed from: c */
    public int m6490c(int i11, int i12, int i13) {
        return m6491d(-1, i11, i12, i13);
    }

    /* renamed from: d */
    public int m6491d(int i11, int i12, float f11, float f12) {
        a aVar;
        if (i11 == i12) {
            if (i12 == -1) {
                aVar = (a) this.f5773d.valueAt(0);
            } else {
                aVar = (a) this.f5773d.get(this.f5771b);
            }
            if (aVar == null) {
                return -1;
            }
            if (this.f5772c != -1 && ((b) aVar.f5776b.get(i11)).m6494a(f11, f12)) {
                return i11;
            }
            int m6493b = aVar.m6493b(f11, f12);
            if (i11 == m6493b) {
                return i11;
            }
            if (m6493b == -1) {
                return aVar.f5777c;
            }
            return ((b) aVar.f5776b.get(m6493b)).f5783e;
        }
        a aVar2 = (a) this.f5773d.get(i12);
        if (aVar2 == null) {
            return -1;
        }
        int m6493b2 = aVar2.m6493b(f11, f12);
        if (m6493b2 == -1) {
            return aVar2.f5777c;
        }
        return ((b) aVar2.f5776b.get(m6493b2)).f5783e;
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1297e;
import androidx.constraintlayout.widget.AbstractC1298f;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.C1300h;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007a1.C0022c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* loaded from: classes2.dex */
public class C1276p {

    /* renamed from: a */
    private final MotionLayout f5202a;

    /* renamed from: n */
    private MotionEvent f5215n;

    /* renamed from: q */
    private MotionLayout.InterfaceC1256g f5218q;

    /* renamed from: r */
    private boolean f5219r;

    /* renamed from: s */
    final C1280t f5220s;

    /* renamed from: t */
    float f5221t;

    /* renamed from: u */
    float f5222u;

    /* renamed from: b */
    C1300h f5203b = null;

    /* renamed from: c */
    b f5204c = null;

    /* renamed from: d */
    private boolean f5205d = false;

    /* renamed from: e */
    private ArrayList f5206e = new ArrayList();

    /* renamed from: f */
    private b f5207f = null;

    /* renamed from: g */
    private ArrayList f5208g = new ArrayList();

    /* renamed from: h */
    private SparseArray f5209h = new SparseArray();

    /* renamed from: i */
    private HashMap f5210i = new HashMap();

    /* renamed from: j */
    private SparseIntArray f5211j = new SparseIntArray();

    /* renamed from: k */
    private boolean f5212k = false;

    /* renamed from: l */
    private int f5213l = 400;

    /* renamed from: m */
    private int f5214m = 0;

    /* renamed from: o */
    private boolean f5216o = false;

    /* renamed from: p */
    private boolean f5217p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.motion.widget.p$a */
    /* loaded from: classes2.dex */
    public class a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C0022c f5223a;

        a(C0022c c0022c) {
            this.f5223a = c0022c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f5223a.mo60a(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1276p(Context context, MotionLayout motionLayout, int i11) {
        this.f5202a = motionLayout;
        this.f5220s = new C1280t(motionLayout);
        m6183K(context, i11);
        this.f5209h.put(AbstractC1297e.motion_base, new C1295c());
        this.f5210i.put("motion_base", Integer.valueOf(AbstractC1297e.motion_base));
    }

    /* renamed from: I */
    private boolean m6181I(int i11) {
        int i12 = this.f5211j.get(i11);
        int size = this.f5211j.size();
        while (i12 > 0) {
            if (i12 == i11) {
                return true;
            }
            int i13 = size - 1;
            if (size < 0) {
                return true;
            }
            i12 = this.f5211j.get(i12);
            size = i13;
        }
        return false;
    }

    /* renamed from: J */
    private boolean m6182J() {
        return this.f5218q != null;
    }

    /* renamed from: K */
    private void m6183K(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c11 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            if (this.f5212k) {
                                System.out.println("parsing = " + name);
                            }
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c11 = 5;
                                        break;
                                    }
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        c11 = '\b';
                                        break;
                                    }
                                    break;
                                case -687739768:
                                    if (name.equals("Include")) {
                                        c11 = 7;
                                        break;
                                    }
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c11 = '\t';
                                        break;
                                    }
                                    break;
                                case 269306229:
                                    if (name.equals("Transition")) {
                                        break;
                                    }
                                    break;
                                case 312750793:
                                    if (name.equals("OnClick")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                                case 327855227:
                                    if (name.equals("OnSwipe")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 793277014:
                                    if (name.equals("MotionScene")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case 1942574248:
                                    if (name.equals("include")) {
                                        c11 = 6;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            switch (c11) {
                                case 0:
                                    m6187O(context, xml);
                                    break;
                                case 1:
                                    ArrayList arrayList = this.f5206e;
                                    bVar = new b(this, context, xml);
                                    arrayList.add(bVar);
                                    if (this.f5204c == null && !bVar.f5226b) {
                                        this.f5204c = bVar;
                                        if (bVar.f5236l != null) {
                                            this.f5204c.f5236l.m6296x(this.f5219r);
                                        }
                                    }
                                    if (!bVar.f5226b) {
                                        break;
                                    } else {
                                        if (bVar.f5227c == -1) {
                                            this.f5207f = bVar;
                                        } else {
                                            this.f5208g.add(bVar);
                                        }
                                        this.f5206e.remove(bVar);
                                        break;
                                    }
                                case 2:
                                    if (bVar == null) {
                                        String resourceEntryName = context.getResources().getResourceEntryName(i11);
                                        int lineNumber = xml.getLineNumber();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(" OnSwipe (");
                                        sb2.append(resourceEntryName);
                                        sb2.append(".xml:");
                                        sb2.append(lineNumber);
                                        sb2.append(")");
                                    }
                                    if (bVar == null) {
                                        break;
                                    } else {
                                        bVar.f5236l = new C1277q(context, this.f5202a, xml);
                                        break;
                                    }
                                case 3:
                                    if (bVar == null) {
                                        break;
                                    } else {
                                        bVar.m6265u(context, xml);
                                        break;
                                    }
                                case 4:
                                    this.f5203b = new C1300h(context, xml);
                                    break;
                                case 5:
                                    m6184L(context, xml);
                                    break;
                                case 6:
                                case 7:
                                    m6186N(context, xml);
                                    break;
                                case '\b':
                                    C1267g c1267g = new C1267g(context, xml);
                                    if (bVar == null) {
                                        break;
                                    } else {
                                        bVar.f5235k.add(c1267g);
                                        break;
                                    }
                                case '\t':
                                    this.f5220s.m6319a(new C1279s(context, xml));
                                    break;
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

    /* renamed from: L */
    private int m6184L(Context context, XmlPullParser xmlPullParser) {
        char c11;
        char c12;
        C1295c c1295c = new C1295c();
        c1295c.m6446R(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            if (this.f5212k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            c11 = 65535;
            switch (c11) {
                case 0:
                    i12 = m6195r(context, attributeValue);
                    break;
                case 1:
                    try {
                        c1295c.f5635d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c12 = 4;
                                    break;
                                }
                                break;
                        }
                        c12 = 65535;
                        switch (c12) {
                            case 0:
                                c1295c.f5635d = 4;
                                break;
                            case 1:
                                c1295c.f5635d = 2;
                                break;
                            case 2:
                                c1295c.f5635d = 0;
                                break;
                            case 3:
                                c1295c.f5635d = 1;
                                break;
                            case 4:
                                c1295c.f5635d = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i11 = m6195r(context, attributeValue);
                    this.f5210i.put(m6190a0(attributeValue), Integer.valueOf(i11));
                    c1295c.f5633b = AbstractC1261a.m6059c(context, i11);
                    break;
            }
        }
        if (i11 != -1) {
            if (this.f5202a.f4997n0 != 0) {
                c1295c.m6447S(true);
            }
            c1295c.m6443E(context, xmlPullParser);
            if (i12 != -1) {
                this.f5211j.put(i11, i12);
            }
            this.f5209h.put(i11, c1295c);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public int m6185M(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m6184L(context, xml);
                }
            }
            return -1;
        } catch (IOException e11) {
            e11.printStackTrace();
            return -1;
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    /* renamed from: N */
    private void m6186N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == AbstractC1298f.include_constraintSet) {
                m6185M(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    private void m6187O(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == AbstractC1298f.MotionScene_defaultDuration) {
                int i12 = obtainStyledAttributes.getInt(index, this.f5213l);
                this.f5213l = i12;
                if (i12 < 8) {
                    this.f5213l = 8;
                }
            } else if (index == AbstractC1298f.MotionScene_layoutDuringTransition) {
                this.f5214m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m6188S(int i11, MotionLayout motionLayout) {
        C1295c c1295c = (C1295c) this.f5209h.get(i11);
        c1295c.f5634c = c1295c.f5633b;
        int i12 = this.f5211j.get(i11);
        if (i12 > 0) {
            m6188S(i12, motionLayout);
            C1295c c1295c2 = (C1295c) this.f5209h.get(i12);
            if (c1295c2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb2.append(AbstractC1261a.m6059c(this.f5202a.getContext(), i12));
                return;
            } else {
                c1295c.f5634c += "/" + c1295c2.f5634c;
                c1295c.m6445M(c1295c2);
            }
        } else {
            c1295c.f5634c += "  layout";
            c1295c.m6444L(motionLayout);
        }
        c1295c.m6449h(c1295c);
    }

    /* renamed from: a0 */
    public static String m6190a0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: r */
    private int m6195r(Context context, String str) {
        int i11;
        if (str.contains("/")) {
            i11 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f5212k) {
                System.out.println("id getMap res = " + i11);
            }
        } else {
            i11 = -1;
        }
        if (i11 == -1 && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        return i11;
    }

    /* renamed from: y */
    private int m6196y(int i11) {
        int m6490c;
        C1300h c1300h = this.f5203b;
        if (c1300h != null && (m6490c = c1300h.m6490c(i11, -1, -1)) != -1) {
            return m6490c;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public float m6197A() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6284l();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public float m6198B() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6285m();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public float m6199C() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6286n();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public float m6200D() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6287o();
        }
        return 0.0f;
    }

    /* renamed from: E */
    public float m6201E() {
        b bVar = this.f5204c;
        if (bVar != null) {
            return bVar.f5233i;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public int m6202F() {
        b bVar = this.f5204c;
        if (bVar != null) {
            return bVar.f5228d;
        }
        return -1;
    }

    /* renamed from: G */
    public b m6203G(int i11) {
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5225a == i11) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: H */
    public List m6204H(int i11) {
        int m6196y = m6196y(i11);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5228d == m6196y || bVar.f5227c == m6196y) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m6205P(float f11, float f12) {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            this.f5204c.f5236l.m6293u(f11, f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m6206Q(float f11, float f12) {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            this.f5204c.f5236l.m6294v(f11, f12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m6207R(MotionEvent motionEvent, int i11, MotionLayout motionLayout) {
        MotionLayout.InterfaceC1256g interfaceC1256g;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f5218q == null) {
            this.f5218q = this.f5202a.m6014u0();
        }
        this.f5218q.mo6043a(motionEvent);
        if (i11 != -1) {
            int action = motionEvent.getAction();
            boolean z11 = false;
            if (action != 0) {
                if (action == 2 && !this.f5216o) {
                    float rawY = motionEvent.getRawY() - this.f5222u;
                    float rawX = motionEvent.getRawX() - this.f5221t;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f5215n) == null) {
                        return;
                    }
                    b m6219i = m6219i(i11, rawX, rawY, motionEvent2);
                    if (m6219i != null) {
                        motionLayout.setTransition(m6219i);
                        RectF m6288p = this.f5204c.f5236l.m6288p(this.f5202a, rectF);
                        if (m6288p != null && !m6288p.contains(this.f5215n.getX(), this.f5215n.getY())) {
                            z11 = true;
                        }
                        this.f5217p = z11;
                        this.f5204c.f5236l.m6298z(this.f5221t, this.f5222u);
                    }
                }
            } else {
                this.f5221t = motionEvent.getRawX();
                this.f5222u = motionEvent.getRawY();
                this.f5215n = motionEvent;
                this.f5216o = false;
                if (this.f5204c.f5236l != null) {
                    RectF m6278f = this.f5204c.f5236l.m6278f(this.f5202a, rectF);
                    if (m6278f != null && !m6278f.contains(this.f5215n.getX(), this.f5215n.getY())) {
                        this.f5215n = null;
                        this.f5216o = true;
                        return;
                    }
                    RectF m6288p2 = this.f5204c.f5236l.m6288p(this.f5202a, rectF);
                    if (m6288p2 != null && !m6288p2.contains(this.f5215n.getX(), this.f5215n.getY())) {
                        this.f5217p = true;
                    } else {
                        this.f5217p = false;
                    }
                    this.f5204c.f5236l.m6295w(this.f5221t, this.f5222u);
                    return;
                }
                return;
            }
        }
        if (this.f5216o) {
            return;
        }
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null && !this.f5217p) {
            this.f5204c.f5236l.m6291s(motionEvent, this.f5218q, i11, this);
        }
        this.f5221t = motionEvent.getRawX();
        this.f5222u = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (interfaceC1256g = this.f5218q) != null) {
            interfaceC1256g.mo6046d();
            this.f5218q = null;
            int i12 = motionLayout.f4958S;
            if (i12 != -1) {
                m6218h(motionLayout, i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m6208T(MotionLayout motionLayout) {
        for (int i11 = 0; i11 < this.f5209h.size(); i11++) {
            int keyAt = this.f5209h.keyAt(i11);
            if (m6181I(keyAt)) {
                return;
            }
            m6188S(keyAt, motionLayout);
        }
    }

    /* renamed from: U */
    public void m6209U(int i11, C1295c c1295c) {
        this.f5209h.put(i11, c1295c);
    }

    /* renamed from: V */
    public void m6210V(int i11) {
        b bVar = this.f5204c;
        if (bVar != null) {
            bVar.m6260E(i11);
        } else {
            this.f5213l = i11;
        }
    }

    /* renamed from: W */
    public void m6211W(boolean z11) {
        this.f5219r = z11;
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            this.f5204c.f5236l.m6296x(this.f5219r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:            if (r2 != (-1)) goto L13;     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6212X(int i11, int i12) {
        int i13;
        int i14;
        C1300h c1300h = this.f5203b;
        if (c1300h != null) {
            i13 = c1300h.m6490c(i11, -1, -1);
            if (i13 == -1) {
                i13 = i11;
            }
            i14 = this.f5203b.m6490c(i12, -1, -1);
        } else {
            i13 = i11;
        }
        i14 = i12;
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5227c == i12 && this.f5204c.f5228d == i11) {
            return;
        }
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if ((bVar2.f5227c == i14 && bVar2.f5228d == i13) || (bVar2.f5227c == i12 && bVar2.f5228d == i11)) {
                this.f5204c = bVar2;
                if (bVar2 != null && bVar2.f5236l != null) {
                    this.f5204c.f5236l.m6296x(this.f5219r);
                    return;
                }
                return;
            }
        }
        b bVar3 = this.f5207f;
        Iterator it2 = this.f5208g.iterator();
        while (it2.hasNext()) {
            b bVar4 = (b) it2.next();
            if (bVar4.f5227c == i12) {
                bVar3 = bVar4;
            }
        }
        b bVar5 = new b(this, bVar3);
        bVar5.f5228d = i13;
        bVar5.f5227c = i14;
        if (i13 != -1) {
            this.f5206e.add(bVar5);
        }
        this.f5204c = bVar5;
    }

    /* renamed from: Y */
    public void m6213Y(b bVar) {
        this.f5204c = bVar;
        if (bVar != null && bVar.f5236l != null) {
            this.f5204c.f5236l.m6296x(this.f5219r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public void m6214Z() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            this.f5204c.f5236l.m6274A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean m6215b0() {
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f5236l != null) {
                return true;
            }
        }
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m6216f(MotionLayout motionLayout, int i11) {
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5237m.size() > 0) {
                Iterator it2 = bVar.f5237m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).m6271c(motionLayout);
                }
            }
        }
        Iterator it3 = this.f5208g.iterator();
        while (it3.hasNext()) {
            b bVar2 = (b) it3.next();
            if (bVar2.f5237m.size() > 0) {
                Iterator it4 = bVar2.f5237m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).m6271c(motionLayout);
                }
            }
        }
        Iterator it5 = this.f5206e.iterator();
        while (it5.hasNext()) {
            b bVar3 = (b) it5.next();
            if (bVar3.f5237m.size() > 0) {
                Iterator it6 = bVar3.f5237m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).m6269a(motionLayout, i11, bVar3);
                }
            }
        }
        Iterator it7 = this.f5208g.iterator();
        while (it7.hasNext()) {
            b bVar4 = (b) it7.next();
            if (bVar4.f5237m.size() > 0) {
                Iterator it8 = bVar4.f5237m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).m6269a(motionLayout, i11, bVar4);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean m6217g(int i11, C1273m c1273m) {
        return this.f5220s.m6322d(i11, c1273m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m6218h(MotionLayout motionLayout, int i11) {
        b bVar;
        if (m6182J() || this.f5205d) {
            return false;
        }
        Iterator it = this.f5206e.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f5238n != 0 && ((bVar = this.f5204c) != bVar2 || !bVar.m6259D(2))) {
                if (i11 == bVar2.f5228d && (bVar2.f5238n == 4 || bVar2.f5238n == 2)) {
                    MotionLayout.EnumC1260k enumC1260k = MotionLayout.EnumC1260k.FINISHED;
                    motionLayout.setState(enumC1260k);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f5238n == 4) {
                        motionLayout.m5994E0();
                        motionLayout.setState(MotionLayout.EnumC1260k.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1260k.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m6005i0(true);
                        motionLayout.setState(MotionLayout.EnumC1260k.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1260k.MOVING);
                        motionLayout.setState(enumC1260k);
                        motionLayout.m6015v0();
                    }
                    return true;
                }
                if (i11 == bVar2.f5227c && (bVar2.f5238n == 3 || bVar2.f5238n == 1)) {
                    MotionLayout.EnumC1260k enumC1260k2 = MotionLayout.EnumC1260k.FINISHED;
                    motionLayout.setState(enumC1260k2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f5238n == 3) {
                        motionLayout.m5996G0();
                        motionLayout.setState(MotionLayout.EnumC1260k.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1260k.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.m6005i0(true);
                        motionLayout.setState(MotionLayout.EnumC1260k.SETUP);
                        motionLayout.setState(MotionLayout.EnumC1260k.MOVING);
                        motionLayout.setState(enumC1260k2);
                        motionLayout.m6015v0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public b m6219i(int i11, float f11, float f12, MotionEvent motionEvent) {
        float f13;
        if (i11 != -1) {
            List<b> m6204H = m6204H(i11);
            RectF rectF = new RectF();
            float f14 = 0.0f;
            b bVar = null;
            for (b bVar2 : m6204H) {
                if (!bVar2.f5239o && bVar2.f5236l != null) {
                    bVar2.f5236l.m6296x(this.f5219r);
                    RectF m6288p = bVar2.f5236l.m6288p(this.f5202a, rectF);
                    if (m6288p == null || motionEvent == null || m6288p.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF m6278f = bVar2.f5236l.m6278f(this.f5202a, rectF);
                        if (m6278f == null || motionEvent == null || m6278f.contains(motionEvent.getX(), motionEvent.getY())) {
                            float m6275a = bVar2.f5236l.m6275a(f11, f12);
                            if (bVar2.f5236l.f5265l && motionEvent != null) {
                                m6275a = ((float) (Math.atan2(f12 + r10, f11 + r9) - Math.atan2(motionEvent.getX() - bVar2.f5236l.f5262i, motionEvent.getY() - bVar2.f5236l.f5263j))) * 10.0f;
                            }
                            if (bVar2.f5227c == i11) {
                                f13 = -1.0f;
                            } else {
                                f13 = 1.1f;
                            }
                            float f15 = m6275a * f13;
                            if (f15 > f14) {
                                bVar = bVar2;
                                f14 = f15;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.f5204c;
    }

    /* renamed from: j */
    public int m6220j() {
        b bVar = this.f5204c;
        if (bVar != null) {
            return bVar.f5240p;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m6221k() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6276d();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C1295c m6222l(int i11) {
        return m6223m(i11, -1, -1);
    }

    /* renamed from: m */
    C1295c m6223m(int i11, int i12, int i13) {
        int m6490c;
        if (this.f5212k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i11);
            printStream.println("size " + this.f5209h.size());
        }
        C1300h c1300h = this.f5203b;
        if (c1300h != null && (m6490c = c1300h.m6490c(i11, i12, i13)) != -1) {
            i11 = m6490c;
        }
        if (this.f5209h.get(i11) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warning could not find ConstraintSet id/");
            sb2.append(AbstractC1261a.m6059c(this.f5202a.getContext(), i11));
            sb2.append(" In MotionScene");
            SparseArray sparseArray = this.f5209h;
            return (C1295c) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C1295c) this.f5209h.get(i11);
    }

    /* renamed from: n */
    public int[] m6224n() {
        int size = this.f5209h.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f5209h.keyAt(i11);
        }
        return iArr;
    }

    /* renamed from: o */
    public ArrayList m6225o() {
        return this.f5206e;
    }

    /* renamed from: p */
    public int m6226p() {
        b bVar = this.f5204c;
        if (bVar != null) {
            return bVar.f5232h;
        }
        return this.f5213l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m6227q() {
        b bVar = this.f5204c;
        if (bVar != null) {
            return bVar.f5227c;
        }
        return -1;
    }

    /* renamed from: s */
    public Interpolator m6228s() {
        int i11 = this.f5204c.f5229e;
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    if (i11 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(C0022c.m59c(this.f5204c.f5230f));
        }
        return AnimationUtils.loadInterpolator(this.f5202a.getContext(), this.f5204c.f5231g);
    }

    /* renamed from: t */
    public void m6229t(C1273m c1273m) {
        b bVar = this.f5204c;
        if (bVar == null) {
            b bVar2 = this.f5207f;
            if (bVar2 != null) {
                Iterator it = bVar2.f5235k.iterator();
                while (it.hasNext()) {
                    ((C1267g) it.next()).m6110b(c1273m);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f5235k.iterator();
        while (it2.hasNext()) {
            ((C1267g) it2.next()).m6110b(c1273m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public float m6230u() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6279g();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public float m6231v() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6280h();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m6232w() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6281i();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public float m6233x(float f11, float f12) {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6282j(f11, f12);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m6234z() {
        b bVar = this.f5204c;
        if (bVar != null && bVar.f5236l != null) {
            return this.f5204c.f5236l.m6283k();
        }
        return 0;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.p$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private int f5225a;

        /* renamed from: b */
        private boolean f5226b;

        /* renamed from: c */
        private int f5227c;

        /* renamed from: d */
        private int f5228d;

        /* renamed from: e */
        private int f5229e;

        /* renamed from: f */
        private String f5230f;

        /* renamed from: g */
        private int f5231g;

        /* renamed from: h */
        private int f5232h;

        /* renamed from: i */
        private float f5233i;

        /* renamed from: j */
        private final C1276p f5234j;

        /* renamed from: k */
        private ArrayList f5235k;

        /* renamed from: l */
        private C1277q f5236l;

        /* renamed from: m */
        private ArrayList f5237m;

        /* renamed from: n */
        private int f5238n;

        /* renamed from: o */
        private boolean f5239o;

        /* renamed from: p */
        private int f5240p;

        /* renamed from: q */
        private int f5241q;

        /* renamed from: r */
        private int f5242r;

        /* renamed from: androidx.constraintlayout.motion.widget.p$b$a */
        /* loaded from: classes2.dex */
        public static class a implements View.OnClickListener {

            /* renamed from: p */
            private final b f5243p;

            /* renamed from: q */
            int f5244q;

            /* renamed from: r */
            int f5245r;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f5244q = -1;
                this.f5245r = 17;
                this.f5243p = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i11 = 0; i11 < indexCount; i11++) {
                    int index = obtainStyledAttributes.getIndex(i11);
                    if (index == AbstractC1298f.OnClick_targetId) {
                        this.f5244q = obtainStyledAttributes.getResourceId(index, this.f5244q);
                    } else if (index == AbstractC1298f.OnClick_clickAction) {
                        this.f5245r = obtainStyledAttributes.getInt(index, this.f5245r);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View] */
            /* renamed from: a */
            public void m6269a(MotionLayout motionLayout, int i11, b bVar) {
                boolean z11;
                boolean z12;
                boolean z13;
                boolean z14;
                int i12 = this.f5244q;
                MotionLayout motionLayout2 = motionLayout;
                if (i12 != -1) {
                    motionLayout2 = motionLayout.findViewById(i12);
                }
                if (motionLayout2 != null) {
                    int i13 = bVar.f5228d;
                    int i14 = bVar.f5227c;
                    if (i13 == -1) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    int i15 = this.f5245r;
                    boolean z15 = false;
                    if ((i15 & 1) != 0 && i11 == i13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i15 & 256) != 0 && i11 == i13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z16 = z11 | z12;
                    if ((i15 & 1) != 0 && i11 == i13) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z17 = z13 | z16;
                    if ((i15 & 16) != 0 && i11 == i14) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z18 = z17 | z14;
                    if ((i15 & 4096) != 0 && i11 == i14) {
                        z15 = true;
                    }
                    if (z18 | z15) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("OnClick could not find id ");
                sb2.append(this.f5244q);
            }

            /* renamed from: b */
            boolean m6270b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f5243p;
                if (bVar2 != bVar) {
                    int i11 = bVar2.f5227c;
                    int i12 = this.f5243p.f5228d;
                    if (i12 == -1) {
                        if (motionLayout.f4958S != i11) {
                            return true;
                        }
                        return false;
                    }
                    int i13 = motionLayout.f4958S;
                    if (i13 == i12 || i13 == i11) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public void m6271c(MotionLayout motionLayout) {
                int i11 = this.f5244q;
                if (i11 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i11);
                if (findViewById == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(" (*)  could not find id ");
                    sb2.append(this.f5244q);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z11;
                boolean z12;
                MotionLayout motionLayout = this.f5243p.f5234j.f5202a;
                if (!motionLayout.m6012t0()) {
                    return;
                }
                if (this.f5243p.f5228d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.m5997H0(this.f5243p.f5227c);
                        return;
                    }
                    b bVar = new b(this.f5243p.f5234j, this.f5243p);
                    bVar.f5228d = currentState;
                    bVar.f5227c = this.f5243p.f5227c;
                    motionLayout.setTransition(bVar);
                    motionLayout.m5994E0();
                    return;
                }
                b bVar2 = this.f5243p.f5234j.f5204c;
                int i11 = this.f5245r;
                boolean z13 = false;
                if ((i11 & 1) == 0 && (i11 & 256) == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if ((i11 & 16) == 0 && (i11 & 4096) == 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    b bVar3 = this.f5243p.f5234j.f5204c;
                    b bVar4 = this.f5243p;
                    if (bVar3 != bVar4) {
                        motionLayout.setTransition(bVar4);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z13 = z11;
                        z12 = false;
                    }
                } else {
                    z13 = z11;
                }
                if (m6270b(bVar2, motionLayout)) {
                    if (z13 && (this.f5245r & 1) != 0) {
                        motionLayout.setTransition(this.f5243p);
                        motionLayout.m5994E0();
                        return;
                    }
                    if (z12 && (this.f5245r & 16) != 0) {
                        motionLayout.setTransition(this.f5243p);
                        motionLayout.m5996G0();
                    } else if (z13 && (this.f5245r & 256) != 0) {
                        motionLayout.setTransition(this.f5243p);
                        motionLayout.setProgress(1.0f);
                    } else if (z12 && (this.f5245r & 4096) != 0) {
                        motionLayout.setTransition(this.f5243p);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        b(C1276p c1276p, b bVar) {
            this.f5225a = -1;
            this.f5226b = false;
            this.f5227c = -1;
            this.f5228d = -1;
            this.f5229e = 0;
            this.f5230f = null;
            this.f5231g = -1;
            this.f5232h = 400;
            this.f5233i = 0.0f;
            this.f5235k = new ArrayList();
            this.f5236l = null;
            this.f5237m = new ArrayList();
            this.f5238n = 0;
            this.f5239o = false;
            this.f5240p = -1;
            this.f5241q = 0;
            this.f5242r = 0;
            this.f5234j = c1276p;
            this.f5232h = c1276p.f5213l;
            if (bVar != null) {
                this.f5240p = bVar.f5240p;
                this.f5229e = bVar.f5229e;
                this.f5230f = bVar.f5230f;
                this.f5231g = bVar.f5231g;
                this.f5232h = bVar.f5232h;
                this.f5235k = bVar.f5235k;
                this.f5233i = bVar.f5233i;
                this.f5241q = bVar.f5241q;
            }
        }

        /* renamed from: v */
        private void m6254v(C1276p c1276p, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                if (index == AbstractC1298f.Transition_constraintSetEnd) {
                    this.f5227c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f5227c);
                    if ("layout".equals(resourceTypeName)) {
                        C1295c c1295c = new C1295c();
                        c1295c.m6442D(context, this.f5227c);
                        c1276p.f5209h.append(this.f5227c, c1295c);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f5227c = c1276p.m6185M(context, this.f5227c);
                    }
                } else if (index == AbstractC1298f.Transition_constraintSetStart) {
                    this.f5228d = typedArray.getResourceId(index, this.f5228d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f5228d);
                    if ("layout".equals(resourceTypeName2)) {
                        C1295c c1295c2 = new C1295c();
                        c1295c2.m6442D(context, this.f5228d);
                        c1276p.f5209h.append(this.f5228d, c1295c2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f5228d = c1276p.m6185M(context, this.f5228d);
                    }
                } else if (index == AbstractC1298f.Transition_motionInterpolator) {
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f5231g = resourceId;
                        if (resourceId != -1) {
                            this.f5229e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        this.f5230f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f5231g = typedArray.getResourceId(index, -1);
                                this.f5229e = -2;
                            } else {
                                this.f5229e = -1;
                            }
                        }
                    } else {
                        this.f5229e = typedArray.getInteger(index, this.f5229e);
                    }
                } else if (index == AbstractC1298f.Transition_duration) {
                    int i13 = typedArray.getInt(index, this.f5232h);
                    this.f5232h = i13;
                    if (i13 < 8) {
                        this.f5232h = 8;
                    }
                } else if (index == AbstractC1298f.Transition_staggered) {
                    this.f5233i = typedArray.getFloat(index, this.f5233i);
                } else if (index == AbstractC1298f.Transition_autoTransition) {
                    this.f5238n = typedArray.getInteger(index, this.f5238n);
                } else if (index == AbstractC1298f.Transition_android_id) {
                    this.f5225a = typedArray.getResourceId(index, this.f5225a);
                } else if (index == AbstractC1298f.Transition_transitionDisable) {
                    this.f5239o = typedArray.getBoolean(index, this.f5239o);
                } else if (index == AbstractC1298f.Transition_pathMotionArc) {
                    this.f5240p = typedArray.getInteger(index, -1);
                } else if (index == AbstractC1298f.Transition_layoutDuringTransition) {
                    this.f5241q = typedArray.getInteger(index, 0);
                } else if (index == AbstractC1298f.Transition_transitionFlags) {
                    this.f5242r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f5228d == -1) {
                this.f5226b = true;
            }
        }

        /* renamed from: w */
        private void m6255w(C1276p c1276p, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.Transition);
            m6254v(c1276p, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: A */
        public int m6256A() {
            return this.f5228d;
        }

        /* renamed from: B */
        public C1277q m6257B() {
            return this.f5236l;
        }

        /* renamed from: C */
        public boolean m6258C() {
            return !this.f5239o;
        }

        /* renamed from: D */
        public boolean m6259D(int i11) {
            return (i11 & this.f5242r) != 0;
        }

        /* renamed from: E */
        public void m6260E(int i11) {
            this.f5232h = Math.max(i11, 8);
        }

        /* renamed from: F */
        public void m6261F(int i11, String str, int i12) {
            this.f5229e = i11;
            this.f5230f = str;
            this.f5231g = i12;
        }

        /* renamed from: G */
        public void m6262G(int i11) {
            C1277q m6257B = m6257B();
            if (m6257B != null) {
                m6257B.m6297y(i11);
            }
        }

        /* renamed from: H */
        public void m6263H(int i11) {
            this.f5240p = i11;
        }

        /* renamed from: t */
        public void m6264t(C1267g c1267g) {
            this.f5235k.add(c1267g);
        }

        /* renamed from: u */
        public void m6265u(Context context, XmlPullParser xmlPullParser) {
            this.f5237m.add(new a(context, this, xmlPullParser));
        }

        /* renamed from: x */
        public int m6266x() {
            return this.f5238n;
        }

        /* renamed from: y */
        public int m6267y() {
            return this.f5227c;
        }

        /* renamed from: z */
        public int m6268z() {
            return this.f5241q;
        }

        public b(int i11, C1276p c1276p, int i12, int i13) {
            this.f5225a = -1;
            this.f5226b = false;
            this.f5227c = -1;
            this.f5228d = -1;
            this.f5229e = 0;
            this.f5230f = null;
            this.f5231g = -1;
            this.f5232h = 400;
            this.f5233i = 0.0f;
            this.f5235k = new ArrayList();
            this.f5236l = null;
            this.f5237m = new ArrayList();
            this.f5238n = 0;
            this.f5239o = false;
            this.f5240p = -1;
            this.f5241q = 0;
            this.f5242r = 0;
            this.f5225a = i11;
            this.f5234j = c1276p;
            this.f5228d = i12;
            this.f5227c = i13;
            this.f5232h = c1276p.f5213l;
            this.f5241q = c1276p.f5214m;
        }

        b(C1276p c1276p, Context context, XmlPullParser xmlPullParser) {
            this.f5225a = -1;
            this.f5226b = false;
            this.f5227c = -1;
            this.f5228d = -1;
            this.f5229e = 0;
            this.f5230f = null;
            this.f5231g = -1;
            this.f5232h = 400;
            this.f5233i = 0.0f;
            this.f5235k = new ArrayList();
            this.f5236l = null;
            this.f5237m = new ArrayList();
            this.f5238n = 0;
            this.f5239o = false;
            this.f5240p = -1;
            this.f5241q = 0;
            this.f5242r = 0;
            this.f5232h = c1276p.f5213l;
            this.f5241q = c1276p.f5214m;
            this.f5234j = c1276p;
            m6255w(c1276p, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}

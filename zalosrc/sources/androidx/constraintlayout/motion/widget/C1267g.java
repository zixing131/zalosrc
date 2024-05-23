package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.C1293a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.g */
/* loaded from: classes2.dex */
public class C1267g {

    /* renamed from: b */
    static HashMap f5097b;

    /* renamed from: a */
    private HashMap f5098a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f5097b = hashMap;
        try {
            hashMap.put("KeyAttribute", C1265e.class.getConstructor(new Class[0]));
            f5097b.put("KeyPosition", C1268h.class.getConstructor(new Class[0]));
            f5097b.put("KeyCycle", AbstractC1266f.class.getConstructor(new Class[0]));
            f5097b.put("KeyTimeCycle", AbstractC1270j.class.getConstructor(new Class[0]));
            f5097b.put("KeyTrigger", AbstractC1271k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C1267g() {
    }

    /* renamed from: a */
    public void m6109a(C1273m c1273m) {
        ArrayList arrayList = (ArrayList) this.f5098a.get(-1);
        if (arrayList != null) {
            c1273m.m6142b(arrayList);
        }
    }

    /* renamed from: b */
    public void m6110b(C1273m c1273m) {
        ArrayList arrayList = (ArrayList) this.f5098a.get(Integer.valueOf(c1273m.f5157c));
        if (arrayList != null) {
            c1273m.m6142b(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f5098a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC1264d abstractC1264d = (AbstractC1264d) it.next();
                if (abstractC1264d.m6069f(((ConstraintLayout.LayoutParams) c1273m.f5156b.getLayoutParams()).f5518c0)) {
                    c1273m.m6141a(abstractC1264d);
                }
            }
        }
    }

    /* renamed from: c */
    public void m6111c(AbstractC1264d abstractC1264d) {
        if (!this.f5098a.containsKey(Integer.valueOf(abstractC1264d.f5075b))) {
            this.f5098a.put(Integer.valueOf(abstractC1264d.f5075b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f5098a.get(Integer.valueOf(abstractC1264d.f5075b));
        if (arrayList != null) {
            arrayList.add(abstractC1264d);
        }
    }

    /* renamed from: d */
    public ArrayList m6112d(int i11) {
        return (ArrayList) this.f5098a.get(Integer.valueOf(i11));
    }

    public C1267g(Context context, XmlPullParser xmlPullParser) {
        HashMap hashMap;
        HashMap hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC1264d abstractC1264d = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f5097b.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) f5097b.get(name);
                            if (constructor != null) {
                                AbstractC1264d abstractC1264d2 = (AbstractC1264d) constructor.newInstance(new Object[0]);
                                try {
                                    abstractC1264d2.mo6068e(context, Xml.asAttributeSet(xmlPullParser));
                                    m6111c(abstractC1264d2);
                                } catch (Exception unused) {
                                }
                                abstractC1264d = abstractC1264d2;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC1264d != null && (hashMap2 = abstractC1264d.f5078e) != null) {
                            C1293a.m6403h(context, xmlPullParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC1264d != null && (hashMap = abstractC1264d.f5078e) != null) {
                        C1293a.m6403h(context, xmlPullParser, hashMap);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }
}

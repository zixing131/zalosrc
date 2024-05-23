package tg;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tg.C26656g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tg.d */
/* loaded from: classes3.dex */
public class RunnableC26653d implements Runnable, InterfaceC26654e {

    /* renamed from: q */
    private final List f126148q;

    /* renamed from: s */
    private byte f126150s;

    /* renamed from: t */
    private final C26656g.b f126151t;

    /* renamed from: p */
    private final long f126147p = System.currentTimeMillis();

    /* renamed from: r */
    private final int f126149r = 2;

    /* renamed from: tg.d$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RunnableC26653d.this.f126151t.mo136814a(RunnableC26653d.this.f126148q, -1, null, RunnableC26653d.this.f126150s);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONArray jSONArray = ((JSONObject) obj).getJSONArray("data");
                if (jSONArray.length() <= RunnableC26653d.this.f126148q.size()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            C26657h c26657h = new C26657h(jSONObject);
                            if (TextUtils.isEmpty(c26657h.f126156a)) {
                                AbstractC20110a.m104538g("Invalid metadata return from server", new Object[0]);
                            } else {
                                linkedHashMap.put(c26657h.f126160e, c26657h);
                                C7960e.m41971c6().m42294V7(c26657h.f126160e, jSONObject.toString());
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                    }
                    int i12 = 0;
                    while (i12 < RunnableC26653d.this.f126148q.size()) {
                        if (linkedHashMap.containsKey((String) RunnableC26653d.this.f126148q.get(i12))) {
                            RunnableC26653d.this.f126148q.remove(i12);
                        } else {
                            i12++;
                        }
                    }
                    RunnableC26653d.this.f126151t.mo136814a(RunnableC26653d.this.f126148q, -1, null, RunnableC26653d.this.f126150s);
                    RunnableC26653d.this.f126151t.mo136814a(new ArrayList(linkedHashMap.keySet()), 0, new ArrayList(linkedHashMap.values()), RunnableC26653d.this.f126150s);
                    return;
                }
                throw new IllegalArgumentException("Invalid metadata list from server");
            } catch (Exception unused) {
                RunnableC26653d.this.f126151t.mo136814a(RunnableC26653d.this.f126148q, -1, null, RunnableC26653d.this.f126150s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26653d(List list, byte b11, C26656g.b bVar) {
        this.f126150s = (byte) 0;
        this.f126148q = list;
        this.f126151t = bVar;
        this.f126150s = b11;
    }

    /* renamed from: f */
    private boolean m136813f(String str) {
        if (Long.parseLong(str) > 0) {
            return true;
        }
        return false;
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: a */
    public long mo136807a() {
        return this.f126147p;
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: d */
    public int mo136808d() {
        return this.f126149r;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Map m42431j6 = C7960e.m41971c6().m42431j6(this.f126148q);
                int i11 = 0;
                while (i11 < this.f126148q.size()) {
                    C26657h c26657h = (C26657h) m42431j6.get(this.f126148q.get(i11));
                    if (m136813f((String) this.f126148q.get(i11)) && (c26657h == null || TextUtils.isEmpty(c26657h.f126156a))) {
                        i11++;
                    }
                    this.f126148q.remove(i11);
                }
                this.f126151t.mo136814a(new ArrayList(m42431j6.keySet()), 0, new ArrayList(m42431j6.values()), this.f126150s);
                if (this.f126148q.size() == 0) {
                    AbstractC20110a.m104535d("EffectMetaData -------------------------", new Object[0]);
                    return;
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                c0766k.mo1686m5(this.f126148q, this.f126150s);
                AbstractC20110a.m104535d("EffectMetaData -------------------------", new Object[0]);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                this.f126151t.mo136814a(this.f126148q, -1, null, this.f126150s);
                AbstractC20110a.m104535d("EffectMetaData -------------------------", new Object[0]);
            }
        } catch (Throwable th2) {
            AbstractC20110a.m104535d("EffectMetaData -------------------------", new Object[0]);
            throw th2;
        }
    }
}

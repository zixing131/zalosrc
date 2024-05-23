package com.zing.zalo.zinstant;

import ae.C0766k;
import ag0.C0808c0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import me0.C23055e5;
import org.json.JSONException;
import org.json.JSONObject;
import p609wh.C29037t0;
import pj0.InterfaceC24789o;
import pj0.InterfaceC24790p;

/* renamed from: com.zing.zalo.zinstant.f1 */
/* loaded from: classes.dex */
public final class C17149f1 implements InterfaceC24789o {

    /* renamed from: com.zing.zalo.zinstant.f1$a */
    /* loaded from: classes7.dex */
    private static final class a extends C29037t0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21299i interfaceC21299i) {
            super(interfaceC21299i);
            AbstractC19074t.m100208f(interfaceC21299i, "listener");
        }

        @Override // p609wh.C29037t0, jm0.AbstractC21298h
        /* renamed from: X */
        public void mo51550X(int i11, String str, String str2) {
            if (i11 == 102) {
                super.mo51550X(i11, str, str2);
            } else if (this.f103757G != null) {
                C20096c c20096c = new C20096c(i11, str);
                c20096c.m104494f(str2);
                this.f103757G.mo1342c(c20096c);
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.f1$b */
    /* loaded from: classes7.dex */
    private static final class b implements InterfaceC21299i {

        /* renamed from: a */
        private final InterfaceC24790p f87678a;

        public b(InterfaceC24790p interfaceC24790p) {
            this.f87678a = interfaceC24790p;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                InterfaceC24790p interfaceC24790p = this.f87678a;
                if (interfaceC24790p != null) {
                    int m104491c = c20096c.m104491c();
                    String m104492d = c20096c.m104492d();
                    AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                    interfaceC24790p.mo91794a(m104491c, m104492d);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                InterfaceC24790p interfaceC24790p = this.f87678a;
                if (interfaceC24790p != null) {
                    String jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                    interfaceC24790p.onSuccess(jSONObject2);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.f1$c */
    /* loaded from: classes7.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24790p f87679a;

        c(InterfaceC24790p interfaceC24790p) {
            this.f87679a = interfaceC24790p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC24790p interfaceC24790p = this.f87679a;
            if (interfaceC24790p != null) {
                int m104491c = c20096c.m104491c();
                String m104492d = c20096c.m104492d();
                AbstractC19074t.m100207e(m104492d, "getError_message(...)");
                interfaceC24790p.mo91794a(m104491c, m104492d);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC24790p interfaceC24790p = this.f87679a;
            if (interfaceC24790p != null) {
                interfaceC24790p.onSuccess(String.valueOf(obj));
            }
        }
    }

    /* renamed from: com.zing.zalo.zinstant.f1$d */
    /* loaded from: classes7.dex */
    public static final class d implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ c f87680a;

        d(c cVar) {
            this.f87680a = cVar;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f87680a.mo926a(c20096c);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            this.f87680a.mo927b(jSONObject.toString());
        }
    }

    /* renamed from: com.zing.zalo.zinstant.f1$e */
    /* loaded from: classes7.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24790p f87681a;

        e(InterfaceC24790p interfaceC24790p) {
            this.f87681a = interfaceC24790p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            InterfaceC24790p interfaceC24790p = this.f87681a;
            if (interfaceC24790p != null) {
                int m104491c = c20096c.m104491c();
                String c20096c2 = c20096c.toString();
                AbstractC19074t.m100207e(c20096c2, "toString(...)");
                interfaceC24790p.mo91794a(m104491c, c20096c2);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC24790p interfaceC24790p = this.f87681a;
            if (interfaceC24790p != null) {
                interfaceC24790p.onSuccess(String.valueOf(obj));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:            r2 = qm0.AbstractC25332a0.m131185M0(r2);     */
    @Override // pj0.InterfaceC24789o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo91704a(String str, Map map, Map map2, String str2, InterfaceC24790p interfaceC24790p) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection values;
        List m131185M0;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (str2 == null || str2.length() == 0) {
            str2 = "";
        }
        b bVar = new b(interfaceC24790p);
        a aVar = new a(bVar);
        if (map2 != null && (r2 = map2.keySet()) != null && m131185M0 != null) {
            arrayList = new ArrayList(m131185M0);
        } else {
            arrayList = null;
        }
        if (map2 != null && (values = map2.values()) != null) {
            arrayList2 = new ArrayList(values);
        } else {
            arrayList2 = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList.add("device_type");
        arrayList2.add("1");
        arrayList.add("client_version");
        arrayList2.add(String.valueOf(CoreUtility.f89236l));
        aVar.m110314j(str, "", (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        aVar.f103775r = 9;
        C17144e c17144e = new C17144e(str2);
        c17144e.m110271n(true);
        aVar.m110309g0(c17144e);
        aVar.f103772o = str;
        aVar.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
        if (C23055e5.m118273h(false, 1, null)) {
            C0808c0.m2046b(aVar);
        } else {
            bVar.mo1342c(new C20096c(50001, AbstractC20095b.f98829a));
        }
    }

    @Override // pj0.InterfaceC24789o
    /* renamed from: b */
    public void mo91705b(int i11, int i12, int i13, Map map, InterfaceC24790p interfaceC24790p) {
        try {
            e eVar = new e(interfaceC24790p);
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(eVar);
            c0766k.mo1779xa(i11, i12, jSONObject.toString(), false);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:            r1 = qm0.AbstractC25332a0.m131185M0(r1);     */
    @Override // pj0.InterfaceC24789o
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo91706c(String str, Map map, Map map2, InterfaceC24790p interfaceC24790p) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection values;
        List m131185M0;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        c cVar = new c(interfaceC24790p);
        C29037t0 c29037t0 = new C29037t0(new d(cVar));
        if (map2 != null && (r1 = map2.keySet()) != null && m131185M0 != null) {
            arrayList = new ArrayList(m131185M0);
        } else {
            arrayList = null;
        }
        if (map2 != null && (values = map2.values()) != null) {
            arrayList2 = new ArrayList(values);
        } else {
            arrayList2 = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        arrayList.add("device_type");
        arrayList2.add("1");
        arrayList.add("client_version");
        arrayList2.add(String.valueOf(CoreUtility.f89236l));
        c29037t0.f103775r = 10;
        c29037t0.m110314j(str, "", (String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
        c29037t0.f103772o = str;
        c29037t0.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
        if (C23055e5.m118273h(false, 1, null)) {
            C0808c0.m2046b(c29037t0);
        } else {
            cVar.mo926a(new C20096c(50001, AbstractC20095b.f98829a));
        }
    }
}

package com.zing.zalo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.AbstractC2065a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3021p1;
import bo.C3025q0;
import bo.C3044u1;
import bo.C3052w1;
import bo.C3056x1;
import br.InterfaceC3116a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.components.SocialMemoryIntroPage;
import com.zing.zalo.feed.components.SocialMemoryOutroPage;
import com.zing.zalo.feed.components.SocialMemoryPage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.u7 */
/* loaded from: classes3.dex */
public class C7230u7 extends AbstractC2065a {

    /* renamed from: e */
    private final C23528a f39683e;

    /* renamed from: f */
    private final InterfaceC3116a f39684f;

    /* renamed from: d */
    private final Map f39682d = new HashMap();

    /* renamed from: c */
    private List f39681c = new ArrayList();

    /* renamed from: com.zing.zalo.adapters.u7$a */
    /* loaded from: classes3.dex */
    public static class a implements d {

        /* renamed from: a */
        private final Context f39685a;

        /* renamed from: b */
        private int f39686b;

        /* renamed from: c */
        private SocialMemoryIntroPage f39687c;

        /* renamed from: d */
        private C3056x1 f39688d;

        /* renamed from: e */
        private int f39689e;

        /* renamed from: f */
        private String f39690f = "";

        /* renamed from: g */
        private int f39691g;

        /* renamed from: h */
        private final C23528a f39692h;

        /* renamed from: i */
        private final InterfaceC3116a f39693i;

        public a(Context context, C23528a c23528a, InterfaceC3116a interfaceC3116a) {
            this.f39685a = context;
            this.f39692h = c23528a;
            this.f39693i = interfaceC3116a;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: T3 */
        public void mo36901T3() {
            SocialMemoryIntroPage socialMemoryIntroPage;
            C3056x1 c3056x1 = this.f39688d;
            if (c3056x1 != null && (socialMemoryIntroPage = this.f39687c) != null) {
                socialMemoryIntroPage.mo43512c(c3056x1, this.f39692h);
                this.f39687c.setupViewsByData(this.f39688d);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: U3 */
        public void mo36902U3(int i11) {
            this.f39686b = i11;
            SocialMemoryIntroPage socialMemoryIntroPage = this.f39687c;
            if (socialMemoryIntroPage != null) {
                socialMemoryIntroPage.setPosition(i11);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: V3 */
        public void mo36903V3(String str) {
            this.f39690f = str;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: W3 */
        public void mo36904W3(int i11) {
            this.f39689e = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: X3 */
        public void mo36905X3(int i11) {
            this.f39691g = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: Y3 */
        public void mo36906Y3(C3056x1 c3056x1, int i11) {
            this.f39688d = c3056x1;
            this.f39686b = i11;
            SocialMemoryIntroPage socialMemoryIntroPage = new SocialMemoryIntroPage(this.f39685a);
            this.f39687c = socialMemoryIntroPage;
            socialMemoryIntroPage.setData(c3056x1);
            this.f39687c.setBgType(this.f39689e);
            this.f39687c.setBackgroundUrl(this.f39690f);
            this.f39687c.setTypoId(this.f39691g);
            this.f39687c.m43515f();
            this.f39687c.setCallback(this.f39693i);
            this.f39687c.setPosition(i11);
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        public View getView() {
            return this.f39687c;
        }
    }

    /* renamed from: com.zing.zalo.adapters.u7$b */
    /* loaded from: classes3.dex */
    public static class b implements d {

        /* renamed from: a */
        private final Context f39694a;

        /* renamed from: b */
        private int f39695b;

        /* renamed from: c */
        private SocialMemoryPage f39696c;

        /* renamed from: d */
        private C3056x1 f39697d;

        /* renamed from: e */
        private int f39698e;

        /* renamed from: f */
        private String f39699f = "";

        /* renamed from: g */
        private int f39700g;

        /* renamed from: h */
        private final C23528a f39701h;

        /* renamed from: i */
        private final InterfaceC3116a f39702i;

        public b(Context context, C23528a c23528a, InterfaceC3116a interfaceC3116a) {
            this.f39694a = context;
            this.f39701h = c23528a;
            this.f39702i = interfaceC3116a;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: T3 */
        public void mo36901T3() {
            SocialMemoryPage socialMemoryPage;
            C3056x1 c3056x1 = this.f39697d;
            if (c3056x1 != null && (socialMemoryPage = this.f39696c) != null) {
                socialMemoryPage.mo43512c(c3056x1, this.f39701h);
                this.f39696c.setupViewsByData(this.f39697d);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: U3 */
        public void mo36902U3(int i11) {
            this.f39695b = i11;
            SocialMemoryPage socialMemoryPage = this.f39696c;
            if (socialMemoryPage != null) {
                socialMemoryPage.setPosition(i11);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: V3 */
        public void mo36903V3(String str) {
            this.f39699f = str;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: W3 */
        public void mo36904W3(int i11) {
            this.f39698e = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: X3 */
        public void mo36905X3(int i11) {
            this.f39700g = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: Y3 */
        public void mo36906Y3(C3056x1 c3056x1, int i11) {
            this.f39697d = c3056x1;
            this.f39695b = i11;
            SocialMemoryPage socialMemoryPage = new SocialMemoryPage(this.f39694a);
            this.f39696c = socialMemoryPage;
            socialMemoryPage.setData(c3056x1);
            this.f39696c.setBgType(this.f39698e);
            this.f39696c.setBackgroundUrl(this.f39699f);
            this.f39696c.setTypoId(this.f39700g);
            this.f39696c.setCallback(this.f39702i);
            this.f39696c.m43515f();
            this.f39696c.setPosition(i11);
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        public View getView() {
            return this.f39696c;
        }
    }

    /* renamed from: com.zing.zalo.adapters.u7$c */
    /* loaded from: classes3.dex */
    public static class c implements d {

        /* renamed from: a */
        private final Context f39703a;

        /* renamed from: b */
        private SocialMemoryOutroPage f39704b;

        /* renamed from: c */
        InterfaceC3116a f39705c;

        /* renamed from: d */
        private int f39706d;

        /* renamed from: e */
        private int f39707e;

        /* renamed from: f */
        private String f39708f = "";

        /* renamed from: g */
        private int f39709g;

        /* renamed from: h */
        private C3056x1 f39710h;

        /* renamed from: i */
        private final C23528a f39711i;

        public c(Context context, C23528a c23528a, InterfaceC3116a interfaceC3116a) {
            this.f39703a = context;
            this.f39705c = interfaceC3116a;
            this.f39711i = c23528a;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: T3 */
        public void mo36901T3() {
            SocialMemoryOutroPage socialMemoryOutroPage;
            C3056x1 c3056x1 = this.f39710h;
            if (c3056x1 != null && (socialMemoryOutroPage = this.f39704b) != null) {
                socialMemoryOutroPage.mo43512c(c3056x1, this.f39711i);
                this.f39704b.setupViewsByData(this.f39710h);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: U3 */
        public void mo36902U3(int i11) {
            this.f39706d = i11;
            SocialMemoryOutroPage socialMemoryOutroPage = this.f39704b;
            if (socialMemoryOutroPage != null) {
                socialMemoryOutroPage.setPosition(i11);
            }
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: V3 */
        public void mo36903V3(String str) {
            this.f39708f = str;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: W3 */
        public void mo36904W3(int i11) {
            this.f39707e = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: X3 */
        public void mo36905X3(int i11) {
            this.f39709g = i11;
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        /* renamed from: Y3 */
        public void mo36906Y3(C3056x1 c3056x1, int i11) {
            this.f39710h = c3056x1;
            this.f39706d = i11;
            SocialMemoryOutroPage socialMemoryOutroPage = new SocialMemoryOutroPage(this.f39703a);
            this.f39704b = socialMemoryOutroPage;
            socialMemoryOutroPage.setData(c3056x1);
            this.f39704b.setBgType(this.f39707e);
            this.f39704b.setBackgroundUrl(this.f39708f);
            this.f39704b.setTypoId(this.f39709g);
            this.f39704b.setPosition(i11);
            this.f39704b.m43515f();
            this.f39704b.setCallback(this.f39705c);
        }

        @Override // com.zing.zalo.adapters.C7230u7.d
        public View getView() {
            return this.f39704b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.u7$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: T3 */
        void mo36901T3();

        /* renamed from: U3 */
        void mo36902U3(int i11);

        /* renamed from: V3 */
        void mo36903V3(String str);

        /* renamed from: W3 */
        void mo36904W3(int i11);

        /* renamed from: X3 */
        void mo36905X3(int i11);

        /* renamed from: Y3 */
        void mo36906Y3(C3056x1 c3056x1, int i11);

        View getView();
    }

    public C7230u7(C23528a c23528a, InterfaceC3116a interfaceC3116a) {
        this.f39683e = c23528a;
        this.f39684f = interfaceC3116a;
    }

    /* renamed from: A */
    private C3044u1 m36889A(d dVar, int i11) {
        if (dVar instanceof a) {
            return m36896z(m36900y(i11 + 1));
        }
        if (dVar instanceof b) {
            return m36896z(m36900y(i11));
        }
        if (dVar instanceof c) {
            return m36896z(m36900y(i11 - 1));
        }
        return null;
    }

    /* renamed from: C */
    private int m36890C(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null) {
            return c3025q0.f12096E;
        }
        return 0;
    }

    /* renamed from: t */
    private d m36891t(ViewGroup viewGroup, int i11) {
        C3052w1 c3052w1;
        C3056x1 c3056x1 = (C3056x1) this.f39681c.get(i11);
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null) {
            int i12 = c3052w1.f12303b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return new c(viewGroup.getContext(), this.f39683e, this.f39684f);
                    }
                } else {
                    return new b(viewGroup.getContext(), this.f39683e, this.f39684f);
                }
            } else {
                return new a(viewGroup.getContext(), this.f39683e, this.f39684f);
            }
        }
        return null;
    }

    /* renamed from: u */
    private int m36892u(C3020p0 c3020p0) {
        if (c3020p0 == null) {
            return 0;
        }
        if (c3020p0.f12058q != 1) {
            return 1;
        }
        return 2;
    }

    /* renamed from: v */
    private String m36893v(d dVar, int i11) {
        C3044u1 m36889A = m36889A(dVar, i11);
        if (m36889A != null) {
            return m36889A.f12271c;
        }
        return "";
    }

    /* renamed from: w */
    private C3020p0 m36894w(C3056x1 c3056x1) {
        C3052w1 c3052w1;
        C3021p1 c3021p1;
        C3000l0 c3000l0;
        if (c3056x1 != null) {
            c3052w1 = c3056x1.f12358e;
        } else {
            c3052w1 = null;
        }
        if (c3052w1 != null) {
            c3021p1 = c3052w1.f12305d;
        } else {
            c3021p1 = null;
        }
        if (c3021p1 != null) {
            c3000l0 = c3021p1.f12071d;
        } else {
            c3000l0 = null;
        }
        if (c3000l0 == null) {
            return null;
        }
        return c3000l0.m14322a0();
    }

    /* renamed from: x */
    private C3020p0 m36895x(d dVar, int i11) {
        if (dVar instanceof a) {
            return m36894w(m36900y(i11 + 1));
        }
        if (dVar instanceof b) {
            return m36894w(m36900y(i11));
        }
        if (dVar instanceof c) {
            return m36894w(m36900y(i11 - 1));
        }
        return null;
    }

    /* renamed from: z */
    private C3044u1 m36896z(C3056x1 c3056x1) {
        C3052w1 c3052w1;
        if (c3056x1 != null) {
            c3052w1 = c3056x1.f12358e;
        } else {
            c3052w1 = null;
        }
        if (c3052w1 == null) {
            return null;
        }
        return c3052w1.f12304c;
    }

    /* renamed from: B */
    public View m36897B(int i11) {
        d m36898D = m36898D(i11);
        if (m36898D != null) {
            return m36898D.getView();
        }
        return null;
    }

    /* renamed from: D */
    public d m36898D(int i11) {
        if (i11 >= 0 && i11 < mo11220d()) {
            return (d) this.f39682d.get(Integer.valueOf(i11));
        }
        return null;
    }

    /* renamed from: E */
    public void m36899E(List list) {
        this.f39681c.clear();
        if (list != null && !list.isEmpty()) {
            this.f39681c = new ArrayList(list);
        }
        m11226j();
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: a */
    public void mo11217a(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
        this.f39682d.remove(Integer.valueOf(i11));
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: d */
    public int mo11220d() {
        List list = this.f39681c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: e */
    public int mo11221e(Object obj) {
        if (!(obj instanceof View)) {
            return -2;
        }
        View view = (View) obj;
        Object tag = view.getTag(AbstractC6918a0.social_memory_refresh);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            return -2;
        }
        C3056x1 c3056x1 = (C3056x1) view.getTag(AbstractC6918a0.social_memory_data);
        int intValue = ((Integer) view.getTag(AbstractC6918a0.social_memory_pos)).intValue();
        int indexOf = this.f39681c.indexOf(c3056x1);
        if (indexOf < 0) {
            this.f39682d.remove(Integer.valueOf(intValue));
            return -2;
        }
        if (intValue == indexOf) {
            return -1;
        }
        d dVar = (d) this.f39682d.get(Integer.valueOf(intValue));
        this.f39682d.remove(Integer.valueOf(intValue));
        this.f39682d.put(Integer.valueOf(indexOf), dVar);
        if (dVar != null) {
            dVar.mo36902U3(indexOf);
        }
        view.setTag(AbstractC6918a0.social_memory_pos, Integer.valueOf(indexOf));
        return indexOf;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: h */
    public Object mo11224h(ViewGroup viewGroup, int i11) {
        d m36891t = m36891t(viewGroup, i11);
        if (m36891t != null) {
            C3020p0 m36895x = m36895x(m36891t, i11);
            m36891t.mo36904W3(m36892u(m36895x));
            m36891t.mo36905X3(m36890C(m36895x));
            m36891t.mo36903V3(m36893v(m36891t, i11));
            C3056x1 c3056x1 = (C3056x1) this.f39681c.get(i11);
            m36891t.mo36906Y3(c3056x1, i11);
            m36891t.mo36901T3();
            View view = m36891t.getView();
            if (view != null) {
                view.setTag(AbstractC6918a0.social_memory_data, c3056x1);
                view.setTag(AbstractC6918a0.social_memory_pos, Integer.valueOf(i11));
            }
            viewGroup.addView(view);
            this.f39682d.put(Integer.valueOf(i11), m36891t);
            InterfaceC3116a interfaceC3116a = this.f39684f;
            if (interfaceC3116a != null) {
                interfaceC3116a.mo15740xf(i11);
                return view;
            }
            return view;
        }
        this.f39682d.remove(Integer.valueOf(i11));
        return null;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: i */
    public boolean mo11225i(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: y */
    public C3056x1 m36900y(int i11) {
        List list;
        if (i11 >= 0 && (list = this.f39681c) != null && !list.isEmpty() && i11 < this.f39681c.size()) {
            return (C3056x1) this.f39681c.get(i11);
        }
        return null;
    }
}

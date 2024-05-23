package com.zing.zalo.feed.components;

import ag0.C0809c1;
import ag0.C0815e1;
import ag0.C0855y0;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import bo.C3000l0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.recyclerview.FeedRecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import p304ks.C21933s;
import p348mi.AbstractC23309i;
import p361nb.C23651h;
import p361nb.C23669z;
import p420pb.C24709a;
import p489rn.C25927x0;
import p604wb.C28905e;
import p716zh.C31874cb;

/* loaded from: classes4.dex */
public class FeedItemSuggestFriends extends RelativeLayout {

    /* renamed from: z */
    private static final int f44763z = AbstractC23136l9.m118722k0();

    /* renamed from: p */
    public int f44764p;

    /* renamed from: q */
    public int f44765q;

    /* renamed from: r */
    private RobotoTextView f44766r;

    /* renamed from: s */
    private RobotoTextView f44767s;

    /* renamed from: t */
    private FeedRecyclerView f44768t;

    /* renamed from: u */
    private C25927x0 f44769u;

    /* renamed from: v */
    public LinearLayoutManager f44770v;

    /* renamed from: w */
    private int f44771w;

    /* renamed from: x */
    InterfaceC8144d f44772x;

    /* renamed from: y */
    C0855y0 f44773y;

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestFriends$a */
    /* loaded from: classes4.dex */
    public class C8141a extends RecyclerView.AbstractC1887n {
        C8141a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            rect.right = AbstractC23136l9.m118742r(8.0f);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestFriends$b */
    /* loaded from: classes4.dex */
    public class C8142b extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestFriends$b$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f44776a;

            /* renamed from: b */
            final /* synthetic */ int f44777b;

            /* renamed from: c */
            final /* synthetic */ List f44778c;

            a(int i11, int i12, List list) {
                this.f44776a = i11;
                this.f44777b = i12;
                this.f44778c = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                FeedItemSuggestFriends.this.m44129c(this.f44776a, this.f44777b, this.f44778c);
            }
        }

        C8142b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            InterfaceC8144d interfaceC8144d;
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && (interfaceC8144d = FeedItemSuggestFriends.this.f44772x) != null) {
                interfaceC8144d.mo43318c();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            FeedItemSuggestFriends.this.m44130d();
            try {
                FeedItemSuggestFriends feedItemSuggestFriends = FeedItemSuggestFriends.this;
                if (feedItemSuggestFriends.f44770v != null && feedItemSuggestFriends.f44769u != null) {
                    int m9740Y1 = FeedItemSuggestFriends.this.f44770v.m9740Y1();
                    int m9745c2 = FeedItemSuggestFriends.this.f44770v.m9745c2();
                    List m133585M = FeedItemSuggestFriends.this.f44769u.m133585M();
                    if (m133585M != null) {
                        C0809c1.m2050b(new a(m9740Y1, m9745c2, m133585M));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestFriends$c */
    /* loaded from: classes4.dex */
    public class C8143c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f44780a;

        /* renamed from: b */
        final /* synthetic */ int f44781b;

        /* renamed from: c */
        final /* synthetic */ int f44782c;

        C8143c(List list, int i11, int i12) {
            this.f44780a = list;
            this.f44781b = i11;
            this.f44782c = i12;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C23651h c23651h;
            String[] strArr;
            C23651h c23651h2;
            String[] strArr2;
            FeedItemSuggestFriends feedItemSuggestFriends = FeedItemSuggestFriends.this;
            if (feedItemSuggestFriends.f44773y == null) {
                feedItemSuggestFriends.f44773y = new C0855y0();
            }
            HashMap m2385c = FeedItemSuggestFriends.this.f44773y.m2385c();
            HashMap m2384b = FeedItemSuggestFriends.this.f44773y.m2384b();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int size = this.f44780a.size();
            for (int i11 = 0; i11 < size; i11++) {
                C31874cb c31874cb = (C31874cb) this.f44780a.get(i11);
                if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146385a)) {
                    String str = c31874cb.f146385a;
                    if (m2385c.containsKey(str)) {
                        C23669z c23669z = (C23669z) m2385c.get(str);
                        if ((c23669z instanceof C23651h) && (c23651h2 = (C23651h) c23669z) != null && (strArr2 = c23651h2.f114659f) != null) {
                            if (!strArr2[2].equals(String.valueOf(i11))) {
                                c23651h2.f114659f[2] = String.valueOf(i11);
                            }
                            if (i11 < this.f44781b || i11 > this.f44782c) {
                                c23669z.f114660g = false;
                            }
                            hashMap.put(str, (C23669z) m2385c.get(str));
                        }
                    }
                    if (m2384b.containsKey(str)) {
                        C23669z c23669z2 = (C23669z) m2384b.get(str);
                        if ((c23669z2 instanceof C23651h) && (c23651h = (C23651h) c23669z2) != null && (strArr = c23651h.f114659f) != null) {
                            if (!strArr[2].equals(String.valueOf(i11))) {
                                c23651h.f114659f[2] = String.valueOf(i11);
                            }
                            hashMap2.put(str, (C23669z) m2384b.get(str));
                        }
                    }
                }
            }
            FeedItemSuggestFriends feedItemSuggestFriends2 = FeedItemSuggestFriends.this;
            if (feedItemSuggestFriends2.f44773y == null) {
                feedItemSuggestFriends2.f44773y = new C0855y0();
            }
            FeedItemSuggestFriends.this.f44773y.m2386d(hashMap);
            FeedItemSuggestFriends.this.f44773y.m2387e(hashMap2);
            FeedItemSuggestFriends.this.m44129c(this.f44781b, this.f44782c, this.f44780a);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestFriends$d */
    /* loaded from: classes4.dex */
    public interface InterfaceC8144d {
        /* renamed from: a */
        void mo43316a();

        /* renamed from: b */
        void mo43317b();

        /* renamed from: c */
        void mo43318c();
    }

    public FeedItemSuggestFriends(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44764p = 0;
        this.f44765q = 0;
    }

    /* renamed from: f */
    private List m44126f(C3000l0 c3000l0) {
        List list;
        if (c3000l0 != null && (list = c3000l0.f11876Y) != null) {
            return list;
        }
        return null;
    }

    /* renamed from: g */
    private boolean m44127g(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C31874cb c31874cb = (C31874cb) it.next();
                    if (!TextUtils.isEmpty(c31874cb.f146396l) && c31874cb.f146400p != 3) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: i */
    public /* synthetic */ void m44128i(InterfaceC2259a interfaceC2259a, View view) {
        int i11;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11929Pw();
        }
        C0815e1 m2075D = C0815e1.m2075D();
        if (this.f44771w == 95) {
            i11 = 5;
        } else {
            i11 = 4;
        }
        m2075D.m2099U(3, 2, i11, String.valueOf(1), "0", "0", "0", "0");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0004, B:5:0x000a, B:15:0x0020, B:17:0x0024, B:20:0x0034, B:22:0x003a, B:24:0x0042, B:29:0x005e, B:31:0x006b, B:33:0x0077, B:37:0x013a, B:38:0x007c, B:40:0x0080, B:42:0x0086, B:45:0x008b, B:47:0x0097, B:49:0x009d, B:51:0x00a5, B:53:0x00b3, B:55:0x0110, B:57:0x011a, B:60:0x00c8, B:63:0x00d3, B:66:0x00fd, B:69:0x0107, B:72:0x0127, B:74:0x012f, B:78:0x013f, B:80:0x0143, B:81:0x014a, B:84:0x002d, B:85:0x0019), top: B:2:0x0004 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m44129c(int i11, int i12, List list) {
        int size;
        HashMap m2385c;
        C31874cb c31874cb;
        int i13;
        C23669z c23669z;
        try {
            if (getContext() != null && AbstractC23309i.m120962G3(3) == 1) {
                char c11 = 0;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (size == 0) {
                    return;
                }
                C0855y0 c0855y0 = this.f44773y;
                if (c0855y0 == null) {
                    m2385c = new HashMap();
                } else {
                    m2385c = c0855y0.m2385c();
                }
                for (int i14 = 0; i14 < size; i14++) {
                    if (list.get(i14) != null && (c31874cb = (C31874cb) list.get(i14)) != null && !c31874cb.f146385a.startsWith("-")) {
                        if (i14 >= i11 && i14 <= i12) {
                            String valueOf = String.valueOf(i14);
                            if (m2385c.containsKey(c31874cb.f146385a)) {
                                C23669z c23669z2 = (C23669z) m2385c.get(c31874cb.f146385a);
                                if (c23669z2 instanceof C23651h) {
                                    C23651h c23651h = (C23651h) c23669z2;
                                    if (c23651h != null && c23651h.f114659f != null && c23651h.m123964l() && !c23669z2.f114660g) {
                                        c23669z2.f114660g = true;
                                        if (c23651h.f114659f[2].equals(valueOf)) {
                                            String str = c23651h.f114659f[c11];
                                            if (str == null || str.isEmpty()) {
                                                str = "1";
                                            }
                                            c23651h.f114659f[c11] = String.valueOf(Integer.parseInt(str) + 1);
                                        } else {
                                            c23669z2.f114656c = System.currentTimeMillis();
                                            c23651h.f114659f[0] = String.valueOf(1);
                                            c23651h.f114659f[2] = valueOf;
                                        }
                                    }
                                }
                                c23669z = (C23669z) m2385c.get(c31874cb.f146385a);
                                if (c23669z != null) {
                                    C24709a.m128299t(getContext()).m128305K(c23669z);
                                }
                            } else {
                                int i15 = 4;
                                if (this.f44771w == 95) {
                                    i13 = 5;
                                } else {
                                    i13 = 4;
                                }
                                C23651h m123961i = C23651h.m123961i(i13, String.valueOf(1), c31874cb.f146385a, valueOf, String.valueOf(c31874cb.f146399o), String.valueOf(c31874cb.f146389e));
                                if (m123961i == null) {
                                    c11 = 0;
                                } else {
                                    m123961i.f114654a = 3;
                                    m123961i.f114655b = 1;
                                    if (this.f44771w == 95) {
                                        i15 = 5;
                                    }
                                    m123961i.f114657d = i15;
                                    m123961i.f114660g = true;
                                    m2385c.put(c31874cb.f146385a, m123961i);
                                    c23669z = (C23669z) m2385c.get(c31874cb.f146385a);
                                    if (c23669z != null) {
                                    }
                                }
                            }
                        } else if (m2385c.containsKey(c31874cb.f146385a)) {
                            c11 = 0;
                            ((C23669z) m2385c.get(c31874cb.f146385a)).f114660g = false;
                        }
                        c11 = 0;
                    }
                }
                if (this.f44773y == null) {
                    this.f44773y = new C0855y0();
                }
                this.f44773y.m2386d(m2385c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m44130d() {
        C31874cb m133584L;
        int width;
        try {
            int m9745c2 = this.f44770v.m9745c2();
            for (int m9740Y1 = this.f44770v.m9740Y1(); m9740Y1 <= m9745c2; m9740Y1++) {
                if (this.f44769u.m133584L(m9740Y1) != null && (m133584L = this.f44769u.m133584L(m9740Y1)) != null) {
                    View mo9732P = this.f44770v.mo9732P(m9740Y1);
                    if ((this.f44768t.m9823C0(mo9732P) instanceof C25927x0.b) && mo9732P.getLeft() + mo9732P.getRight() > (width = (int) (mo9732P.getWidth() * 0.8f)) && this.f44768t.getWidth() - mo9732P.getLeft() > width) {
                        C28905e.m144373n().m144400v(m133584L.f146385a, 10, this.f44771w, m9740Y1, "");
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m44131e(C3000l0 c3000l0) {
        int i11;
        LinearLayoutManager linearLayoutManager;
        try {
            if (!TextUtils.isEmpty(C21933s.f107870s0)) {
                List m44126f = m44126f(c3000l0);
                if (m44126f != null && !m44126f.isEmpty()) {
                    ArrayList arrayList = new ArrayList(m44126f);
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if (((C31874cb) arrayList.get(i12)).f146385a.equals(C21933s.f107870s0)) {
                            i11 = i12 + 1;
                            break;
                        }
                    }
                }
                i11 = -1;
                if (i11 != -1 && (linearLayoutManager = this.f44770v) != null) {
                    linearLayoutManager.m9721B2(i11, this.f44765q);
                }
                C21933s.f107870s0 = "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C25927x0 getFeedSuggestFriendAdapter() {
        return this.f44769u;
    }

    public RecyclerView getRecycleView() {
        return this.f44768t;
    }

    /* renamed from: h */
    public void m44132h(Context context, int i11) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_suggest_friends_content, this);
            this.f44766r = (RobotoTextView) findViewById(AbstractC6918a0.tvSuggestTitle);
            this.f44767s = (RobotoTextView) findViewById(AbstractC6918a0.tvSeemore);
            this.f44768t = (FeedRecyclerView) findViewById(AbstractC6918a0.rc_page_suggest);
            this.f44770v = new NoPredictiveItemAnimLinearLayoutMngr(context);
            int m118712h = AbstractC23136l9.m118712h(context, 120.0f);
            this.f44764p = m118712h;
            this.f44765q = (f44763z - m118712h) / 2;
            this.f44770v.m9723C2(0);
            this.f44768t.setLayoutManager(this.f44770v);
            this.f44768t.m9816A(new C8141a());
            this.f44768t.setOverScrollMode(2);
            C25927x0 c25927x0 = new C25927x0(context);
            this.f44769u = c25927x0;
            this.f44768t.setAdapter(c25927x0);
            this.f44768t.m9826E(new C8142b());
            this.f44771w = i11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m44133j(Parcelable parcelable) {
        LinearLayoutManager linearLayoutManager = this.f44770v;
        if (linearLayoutManager != null && parcelable != null) {
            linearLayoutManager.mo9742a1(parcelable);
        }
    }

    /* renamed from: k */
    public void m44134k(C3000l0 c3000l0, InterfaceC2259a interfaceC2259a) {
        int i11;
        String string;
        if (c3000l0 == null) {
            return;
        }
        try {
            List m44126f = m44126f(c3000l0);
            if (m44126f != null && !m44126f.isEmpty()) {
                ArrayList arrayList = new ArrayList(m44126f);
                boolean m44127g = m44127g(arrayList);
                this.f44769u.m133589Q(interfaceC2259a);
                this.f44769u.m133588P(arrayList, c3000l0);
                this.f44769u.m133590R(m44127g);
                this.f44769u.m10008p();
                if (this.f44766r != null) {
                    if (!TextUtils.isEmpty(c3000l0.f11877Z)) {
                        string = c3000l0.f11877Z;
                    } else {
                        string = this.f44766r.getContext().getString(AbstractC8020f0.suggestfriend_title);
                    }
                    this.f44766r.setText(string);
                }
                RobotoTextView robotoTextView = this.f44767s;
                if (robotoTextView != null) {
                    if (C21933s.m114404I().m114502y0()) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    robotoTextView.setVisibility(i11);
                    this.f44767s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.s4

                        /* renamed from: q */
                        public final /* synthetic */ InterfaceC2259a f45676q;

                        public /* synthetic */ ViewOnClickListenerC8382s4(InterfaceC2259a interfaceC2259a2) {
                            r2 = interfaceC2259a2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedItemSuggestFriends.this.m44128i(r2, view);
                        }
                    });
                }
                m44135l(arrayList, this.f44770v.m9740Y1(), this.f44770v.m9745c2());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    void m44135l(List list, int i11, int i12) {
        if (getContext() == null || AbstractC23309i.m120962G3(3) != 1 || list == null) {
            return;
        }
        C0809c1.m2050b(new C8143c(new ArrayList(list), i11, i12));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC8144d interfaceC8144d;
        InterfaceC8144d interfaceC8144d2;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (interfaceC8144d2 = this.f44772x) != null) {
            interfaceC8144d2.mo43316a();
        }
        if (motionEvent != null && ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (interfaceC8144d = this.f44772x) != null)) {
            interfaceC8144d.mo43317b();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCatchTouchEventListener(InterfaceC8144d interfaceC8144d) {
        this.f44772x = interfaceC8144d;
    }

    public FeedItemSuggestFriends(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44764p = 0;
        this.f44765q = 0;
    }
}

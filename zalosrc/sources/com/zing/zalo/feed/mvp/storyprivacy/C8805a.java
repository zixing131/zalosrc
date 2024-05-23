package com.zing.zalo.feed.mvp.storyprivacy;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.feed.models.PrivacyInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import p401or.C24411a;
import p649xl.C29877jd;
import qm0.AbstractC25332a0;

/* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a */
/* loaded from: classes4.dex */
public final class C8805a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private b f47127r;

    /* renamed from: s */
    private List f47128s = new ArrayList();

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo47045a(PrivacyInfo privacyInfo);
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m47059a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29877jd m148134c = C29877jd.m148134c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148134c, "inflate(...)");
                return new c(m148134c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C29877jd c29877jd) {
            super(c29877jd.getRoot());
            AbstractC19074t.m100208f(c29877jd, "binding");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final StoryPrivacyItemRow f47129I;

        /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.a$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m47061a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                return new d(new StoryPrivacyItemRow(viewGroup.getContext(), null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(StoryPrivacyItemRow storyPrivacyItemRow) {
            super(storyPrivacyItemRow);
            AbstractC19074t.m100208f(storyPrivacyItemRow, "contentView");
            this.f47129I = storyPrivacyItemRow;
        }

        /* renamed from: i0 */
        public final void m47060i0(C24411a c24411a, b bVar) {
            if (c24411a != null) {
                this.f47129I.m47056W(c24411a, bVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        C24411a c24411a = (C24411a) this.f47128s.get(i11);
        if (!(abstractC1876c0 instanceof c) && (abstractC1876c0 instanceof d)) {
            ((d) abstractC1876c0).m47060i0(c24411a, this.f47127r);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 == 2) {
                return d.Companion.m47061a(viewGroup);
            }
            throw new ClassCastException("StoryPrivacyBottomSheetAdapter Unknown view type: " + i11);
        }
        return c.Companion.m47059a(viewGroup);
    }

    /* renamed from: L */
    public final void m47057L(List list) {
        List m131187O0;
        AbstractC19074t.m100208f(list, "items");
        try {
            m131187O0 = AbstractC25332a0.m131187O0(list);
            this.f47128s = m131187O0;
            m10008p();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: M */
    public final void m47058M(b bVar) {
        this.f47127r = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f47128s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Integer num;
        if (i11 < 0 || i11 >= this.f47128s.size()) {
            return 0;
        }
        C24411a c24411a = (C24411a) this.f47128s.get(i11);
        if (c24411a != null) {
            num = Integer.valueOf(c24411a.m127669b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return 1;
        }
        if (num == null || num.intValue() != 2) {
            return 0;
        }
        return 2;
    }
}

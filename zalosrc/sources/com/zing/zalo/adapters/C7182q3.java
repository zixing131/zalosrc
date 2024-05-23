package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ci.C3499e0;
import ci.C3508j;
import ci.C3510k;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mediastore.collection.MediaStoreCollectionItemView;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSkeletonView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import qm0.AbstractC25332a0;
import zl0.AbstractC32232i;

/* renamed from: com.zing.zalo.adapters.q3 */
/* loaded from: classes3.dex */
public final class C7182q3 extends RecyclerView.AbstractC1880g {
    public static final c Companion = new c(null);

    /* renamed from: A */
    private CharSequence f39312A;

    /* renamed from: B */
    private C3508j.b f39313B;

    /* renamed from: r */
    private C3499e0 f39314r;

    /* renamed from: s */
    private final List f39315s = new ArrayList();

    /* renamed from: t */
    private final List f39316t = new ArrayList();

    /* renamed from: u */
    private b f39317u;

    /* renamed from: v */
    private C23528a f39318v;

    /* renamed from: w */
    private boolean f39319w;

    /* renamed from: x */
    private boolean f39320x;

    /* renamed from: y */
    private boolean f39321y;

    /* renamed from: z */
    private CharSequence f39322z;

    /* renamed from: com.zing.zalo.adapters.q3$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private int f39323a;

        /* renamed from: b */
        private C3508j f39324b;

        /* renamed from: c */
        private CharSequence f39325c;

        /* renamed from: d */
        private int f39326d = 5;

        /* renamed from: e */
        private boolean f39327e = true;

        /* renamed from: a */
        public final C3508j m36495a() {
            return this.f39324b;
        }

        /* renamed from: b */
        public final int m36496b() {
            return this.f39323a;
        }

        /* renamed from: c */
        public final boolean m36497c() {
            return this.f39327e;
        }

        /* renamed from: d */
        public final int m36498d() {
            return this.f39326d;
        }

        /* renamed from: e */
        public final void m36499e(C3508j c3508j) {
            this.f39324b = c3508j;
        }

        /* renamed from: f */
        public final void m36500f(int i11) {
            this.f39323a = i11;
        }

        /* renamed from: g */
        public final void m36501g(boolean z11) {
            this.f39327e = z11;
        }

        /* renamed from: h */
        public final void m36502h(int i11) {
            this.f39326d = i11;
        }

        /* renamed from: i */
        public final void m36503i(CharSequence charSequence) {
            this.f39325c = charSequence;
        }
    }

    /* renamed from: com.zing.zalo.adapters.q3$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo36504a(C3508j c3508j);

        /* renamed from: b */
        void mo36505b();
    }

    /* renamed from: com.zing.zalo.adapters.q3$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.q3$d */
    /* loaded from: classes3.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private MediaStoreCollectionItemView f39328I;

        /* renamed from: J */
        private LinearLayout f39329J;

        /* renamed from: K */
        private LinearLayout f39330K;

        /* renamed from: L */
        private MediaStoreMediaSkeletonView f39331L;

        /* renamed from: M */
        private RobotoTextView f39332M;

        /* renamed from: N */
        private RobotoTextView f39333N;

        /* renamed from: O */
        private TextView f39334O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
        public d(View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            try {
                switch (i11) {
                    case 1:
                        this.f39334O = (TextView) view;
                        return;
                    case 2:
                    case 3:
                        this.f39329J = (LinearLayout) view.findViewById(AbstractC6918a0.layout_loading);
                        this.f39330K = (LinearLayout) view.findViewById(AbstractC6918a0.layout_error);
                        return;
                    case 4:
                        this.f39328I = (MediaStoreCollectionItemView) view;
                        return;
                    case 5:
                        this.f39331L = (MediaStoreMediaSkeletonView) view;
                        return;
                    case 6:
                        this.f39332M = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_empty_title);
                        this.f39333N = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_empty_desc);
                        return;
                    default:
                        return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: i0 */
        public final MediaStoreCollectionItemView m36506i0() {
            return this.f39328I;
        }

        /* renamed from: j0 */
        public final TextView m36507j0() {
            return this.f39334O;
        }

        /* renamed from: k0 */
        public final LinearLayout m36508k0() {
            return this.f39330K;
        }

        /* renamed from: l0 */
        public final LinearLayout m36509l0() {
            return this.f39329J;
        }

        /* renamed from: m0 */
        public final MediaStoreMediaSkeletonView m36510m0() {
            return this.f39331L;
        }

        /* renamed from: n0 */
        public final RobotoTextView m36511n0() {
            return this.f39333N;
        }

        /* renamed from: o0 */
        public final RobotoTextView m36512o0() {
            return this.f39332M;
        }
    }

    /* renamed from: com.zing.zalo.adapters.q3$e */
    /* loaded from: classes3.dex */
    public static final class e extends GridLayoutManager.AbstractC1865b {
        e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1865b
        /* renamed from: f */
        public int mo9682f(int i11) {
            a aVar;
            if (i11 >= 0 && i11 < C7182q3.this.m36482N().size()) {
                aVar = (a) C7182q3.this.m36482N().get(i11);
            } else {
                aVar = null;
            }
            if (aVar != null && aVar.m36496b() == 4) {
                return 1;
            }
            return 2;
        }
    }

    public C7182q3(Context context) {
        this.f39318v = new C23528a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m36480P(MediaStoreCollectionItemView mediaStoreCollectionItemView, C7182q3 c7182q3, View view) {
        b bVar;
        AbstractC19074t.m100208f(mediaStoreCollectionItemView, "$this_apply");
        AbstractC19074t.m100208f(c7182q3, "this$0");
        C3508j albumItem = mediaStoreCollectionItemView.getAlbumItem();
        if (albumItem != null && (bVar = c7182q3.f39317u) != null) {
            bVar.mo36504a(albumItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m36481Q(C7182q3 c7182q3, View view) {
        AbstractC19074t.m100208f(c7182q3, "this$0");
        b bVar = c7182q3.f39317u;
        if (bVar != null) {
            bVar.mo36505b();
        }
    }

    /* renamed from: N */
    public final List m36482N() {
        return this.f39316t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(d dVar, int i11) {
        a aVar;
        int i12;
        AbstractC19074t.m100208f(dVar, "holder");
        if (i11 >= 0 && i11 < this.f39316t.size()) {
            aVar = (a) this.f39316t.get(i11);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        int i13 = 8;
        switch (aVar.m36496b()) {
            case 1:
                TextView m36507j0 = dVar.m36507j0();
                if (m36507j0 != null) {
                    m36507j0.setText(this.f39312A);
                    return;
                }
                return;
            case 2:
                LinearLayout m36509l0 = dVar.m36509l0();
                if (m36509l0 != null) {
                    m36509l0.setVisibility(0);
                }
                LinearLayout m36508k0 = dVar.m36508k0();
                if (m36508k0 != null) {
                    m36508k0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                LinearLayout m36509l02 = dVar.m36509l0();
                if (m36509l02 != null) {
                    m36509l02.setVisibility(8);
                }
                LinearLayout m36508k02 = dVar.m36508k0();
                if (m36508k02 != null) {
                    m36508k02.setVisibility(0);
                }
                LinearLayout m36508k03 = dVar.m36508k0();
                if (m36508k03 != null) {
                    m36508k03.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.p3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7182q3.m36481Q(C7182q3.this, view);
                        }
                    });
                    return;
                }
                return;
            case 4:
                final MediaStoreCollectionItemView m36506i0 = dVar.m36506i0();
                if (m36506i0 != null) {
                    m36506i0.m69432c(aVar.m36495a(), false);
                    dVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.o3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7182q3.m36480P(MediaStoreCollectionItemView.this, this, view);
                        }
                    });
                    return;
                }
                return;
            case 5:
                MediaStoreMediaSkeletonView m36510m0 = dVar.m36510m0();
                if (m36510m0 != null) {
                    m36510m0.setSkeletonLayoutType(aVar.m36498d());
                    return;
                }
                return;
            case 6:
                RobotoTextView m36512o0 = dVar.m36512o0();
                if (m36512o0 != null) {
                    if (aVar.m36497c()) {
                        i12 = AbstractC8020f0.str_media_store_empty_collection_list_title;
                    } else {
                        i12 = AbstractC8020f0.str_album_no_photo;
                    }
                    m36512o0.setText(AbstractC23136l9.m118743r0(i12));
                }
                RobotoTextView m36511n0 = dVar.m36511n0();
                if (aVar.m36497c()) {
                    i13 = 0;
                }
                AbstractC23136l9.m118744r1(m36511n0, i13);
                return;
            default:
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        switch (i11) {
            case 1:
                AbstractC19074t.m100205c(context);
                RobotoTextView robotoTextView = new RobotoTextView(context);
                robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC32232i.m155453a(48.0f)));
                robotoTextView.setGravity(17);
                robotoTextView.setTextSize(1, 16.0f);
                robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
                view = robotoTextView;
                break;
            case 2:
            case 3:
                view = from.inflate(AbstractC7409c0.layout_media_store_footer, viewGroup, false);
                break;
            case 4:
                MediaStoreCollectionItemView mediaStoreCollectionItemView = new MediaStoreCollectionItemView(context, 2);
                mediaStoreCollectionItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view = mediaStoreCollectionItemView;
                break;
            case 5:
                MediaStoreMediaSkeletonView mediaStoreMediaSkeletonView = new MediaStoreMediaSkeletonView(context);
                mediaStoreMediaSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                view = mediaStoreMediaSkeletonView;
                break;
            case 6:
                view = from.inflate(AbstractC7409c0.layout_media_store_album_list_empty, viewGroup, false);
                break;
            default:
                AbstractC19074t.m100205c(context);
                RobotoTextView robotoTextView2 = new RobotoTextView(context);
                robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                view = robotoTextView2;
                break;
        }
        AbstractC19074t.m100205c(view);
        return new d(view, i11);
    }

    /* renamed from: S */
    public final void m36485S(b bVar) {
        this.f39317u = bVar;
    }

    /* renamed from: T */
    public final void m36486T(C3499e0 c3499e0, List list) {
        List<C3508j> m131202b0;
        AbstractC19074t.m100208f(list, "albums");
        this.f39315s.clear();
        this.f39314r = c3499e0;
        m131202b0 = AbstractC25332a0.m131202b0(list);
        for (C3508j c3508j : m131202b0) {
            a aVar = new a();
            aVar.m36500f(4);
            if (c3508j instanceof C3510k) {
                if (((C3510k) c3508j).m17743Z0()) {
                    aVar.m36499e(c3508j);
                    this.f39315s.add(aVar);
                }
            } else {
                aVar.m36499e(c3508j);
                this.f39315s.add(aVar);
            }
        }
        m36494b0();
    }

    /* renamed from: U */
    public final void m36487U(C3508j.b bVar) {
        this.f39313B = bVar;
    }

    /* renamed from: V */
    public final void m36488V(CharSequence charSequence) {
        this.f39312A = charSequence;
    }

    /* renamed from: W */
    public final void m36489W(CharSequence charSequence) {
        this.f39322z = charSequence;
    }

    /* renamed from: X */
    public final void m36490X(boolean z11) {
        this.f39319w = z11;
    }

    /* renamed from: Y */
    public final void m36491Y(boolean z11) {
        this.f39321y = z11;
    }

    /* renamed from: Z */
    public final void m36492Z(boolean z11) {
        this.f39320x = z11;
    }

    /* renamed from: a0 */
    public final void m36493a0(GridLayoutManager gridLayoutManager) {
        if (gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.m9670e3(2);
        gridLayoutManager.m9671f3(new e());
    }

    /* renamed from: b0 */
    public final void m36494b0() {
        Boolean bool;
        this.f39316t.clear();
        C3508j.b bVar = this.f39313B;
        if (bVar != null) {
            C3499e0 c3499e0 = this.f39314r;
            if (c3499e0 != null) {
                bool = Boolean.valueOf(c3499e0.m17633p0(bVar));
            } else {
                bool = null;
            }
            if (bool != null && bool.booleanValue()) {
                List list = this.f39316t;
                a aVar = new a();
                aVar.m36500f(5);
                aVar.m36502h(5);
                list.add(aVar);
                return;
            }
        }
        boolean z11 = true;
        if (!(!this.f39315s.isEmpty())) {
            List list2 = this.f39316t;
            a aVar2 = new a();
            aVar2.m36500f(6);
            if (this.f39313B != null) {
                z11 = false;
            }
            aVar2.m36501g(z11);
            list2.add(aVar2);
            return;
        }
        this.f39316t.addAll(this.f39315s);
        if (this.f39320x) {
            List list3 = this.f39316t;
            a aVar3 = new a();
            aVar3.m36500f(2);
            list3.add(aVar3);
        }
        if (this.f39321y) {
            List list4 = this.f39316t;
            a aVar4 = new a();
            aVar4.m36500f(3);
            list4.add(aVar4);
        }
        if (!this.f39320x && !this.f39321y && !TextUtils.isEmpty(this.f39312A)) {
            List list5 = this.f39316t;
            a aVar5 = new a();
            aVar5.m36500f(1);
            aVar5.m36503i(this.f39312A);
            list5.add(aVar5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39316t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        C3508j m36495a;
        if (i11 >= 0 && i11 < this.f39316t.size() && (m36495a = ((a) this.f39316t.get(i11)).m36495a()) != null && m36495a.m17711w0() > 0) {
            return m36495a.m17711w0();
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        a aVar;
        if (i11 >= 0 && i11 < this.f39316t.size()) {
            aVar = (a) this.f39316t.get(i11);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.m36496b();
        }
        return 0;
    }
}

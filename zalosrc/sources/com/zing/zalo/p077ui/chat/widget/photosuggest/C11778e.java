package com.zing.zalo.p077ui.chat.widget.photosuggest;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.chat.widget.photosuggest.C11778e;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import dg0.AbstractC17927b;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e */
/* loaded from: classes5.dex */
public class C11778e extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f61273r;

    /* renamed from: s */
    private final C23528a f61274s;

    /* renamed from: t */
    private b f61275t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e$a */
    /* loaded from: classes5.dex */
    public class a extends FrameLayout {

        /* renamed from: p */
        private final RoundedImageView f61276p;

        /* renamed from: q */
        private final C3977j f61277q;

        /* renamed from: r */
        private final AppCompatImageView f61278r;

        /* renamed from: s */
        private String f61279s;

        /* renamed from: t */
        private long f61280t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C32757a extends C23999j {
            C32757a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                if (TextUtils.equals(str, a.this.f61279s)) {
                    a.this.f61277q.setImageInfo(c3979l);
                    if (c3979l != null && c3979l.m18839c() != null) {
                        a.this.f61276p.setImageBitmap(c3979l.m18839c());
                        a.this.f61276p.invalidate();
                    }
                }
            }
        }

        public a(Context context) {
            super(context);
            this.f61277q = new C3977j(context);
            RoundedImageView roundedImageView = new RoundedImageView(context);
            this.f61276p = roundedImageView;
            int i11 = NewMultiPhotoSuggestCollapsedView.f61123P;
            int i12 = NewMultiPhotoSuggestCollapsedView.f61132b0;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (i12 * 2) + i11 + NewMultiPhotoSuggestCollapsedView.f61138h0);
            layoutParams.gravity = 53;
            layoutParams.rightMargin = NewMultiPhotoSuggestCollapsedView.f61143m0;
            layoutParams.topMargin = NewMultiPhotoSuggestCollapsedView.f61144n0;
            roundedImageView.setAdjustViewBounds(true);
            roundedImageView.setApplyMinWidthWitAdjustViewBounds(true);
            roundedImageView.m76289j(8.0f, 8.0f, 8.0f, 8.0f);
            roundedImageView.setBorderWidthDP(1.7f);
            roundedImageView.setBorderColor(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
            roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            roundedImageView.setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_9patch_suggest_multiphoto));
            roundedImageView.setLayoutParams(layoutParams);
            roundedImageView.setImageDrawable(C23278z2.m120065D0().f116261b);
            int i13 = NewMultiPhotoSuggestCollapsedView.f61137g0;
            roundedImageView.setMinimumWidth(((int) (i11 / 1.5d)) + (i12 * 2) + i13);
            roundedImageView.setMaxWidth(((int) (i11 / 0.25d)) + (i12 * 2) + i13);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            this.f61278r = appCompatImageView;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(30.0f));
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.gravity = 53;
            int i14 = NewMultiPhotoSuggestCollapsedView.f61142l0;
            appCompatImageView.setPadding(i14, i14, i14, i14);
            appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_icon_suggest_photo_remove_all));
            appCompatImageView.setLayoutParams(layoutParams2);
            setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
            addView(roundedImageView);
            addView(appCompatImageView);
            this.f61279s = "";
            this.f61280t = -1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m65542i(c.a aVar) {
            C11778e.this.f61275t.mo65521a(aVar.mo65548a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m65543j(final c.a aVar, View view) {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.c
                @Override // java.lang.Runnable
                public final void run() {
                    C11778e.a.this.m65542i(aVar);
                }
            }, 500L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m65544k(c.a aVar) {
            C11778e.this.f61275t.mo65522b(aVar.mo65548a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m65545l(final c.a aVar, View view) {
            AbstractC17927b.m94533b().mo94527a("THROTTLE_FIRST_CLICK_SUGGEST_PHOTO", new Runnable() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.d
                @Override // java.lang.Runnable
                public final void run() {
                    C11778e.a.this.m65544k(aVar);
                }
            }, 500L);
        }

        /* renamed from: h */
        public void m65546h(C23528a c23528a, MediaItem mediaItem, final c.a aVar) {
            String mo41083a0;
            boolean z11;
            this.f61276p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11778e.a.this.m65543j(aVar, view);
                }
            });
            this.f61278r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C11778e.a.this.m65545l(aVar, view);
                }
            });
            if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                mo41083a0 = mediaItem.m41113N();
            } else {
                mo41083a0 = mediaItem.mo41083a0();
            }
            long mo41090x = mediaItem.mo41090x();
            if (mo41090x != this.f61280t) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f61279s = mo41083a0;
            this.f61280t = mo41090x;
            if (!TextUtils.isEmpty(mo41083a0)) {
                if (C23999j.m125696L2(this.f61279s, C23278z2.m120065D0())) {
                    C3979l m125676A2 = C23999j.m125676A2(this.f61279s, C23278z2.m120065D0().f116260a, C23278z2.m120065D0().f116266g);
                    if (m125676A2 != null && m125676A2.m18839c() != null) {
                        this.f61276p.setImageBitmap(m125676A2.m18839c());
                        return;
                    } else {
                        this.f61276p.setImageDrawable(C23278z2.m120065D0().f116261b);
                        return;
                    }
                }
                if (z11) {
                    this.f61276p.setImageDrawable(C23278z2.m120065D0().f116261b);
                }
                ((C23528a) c23528a.m123612r(this.f61277q)).m123579C(this.f61279s, C23278z2.m120065D0(), new C32757a());
                return;
            }
            this.f61276p.setImageDrawable(C23278z2.m120065D0().f116261b);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo65521a(int i11);

        /* renamed from: b */
        void mo65522b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e$c */
    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        a f61283I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.chat.widget.photosuggest.e$c$a */
        /* loaded from: classes5.dex */
        public interface a {
            /* renamed from: a */
            int mo65548a();
        }

        public c(View view) {
            super(view);
            this.f61283I = (a) view;
        }

        /* renamed from: i0 */
        public void m65547i0(C23528a c23528a, MediaItem mediaItem) {
            this.f61283I.m65546h(c23528a, mediaItem, new a() { // from class: com.zing.zalo.ui.chat.widget.photosuggest.f
                @Override // com.zing.zalo.p077ui.chat.widget.photosuggest.C11778e.c.a
                /* renamed from: a */
                public final int mo65548a() {
                    return C11778e.c.this.m9929A();
                }
            });
        }
    }

    public C11778e(Context context) {
        this.f61274s = new C23528a(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        cVar.m65547i0(this.f61274s, (MediaItem) this.f61273r.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        return new c(new a(viewGroup.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9996G(c cVar) {
        super.mo9996G(cVar);
    }

    /* renamed from: P */
    public void m65533P(List list) {
        this.f61273r = list;
    }

    /* renamed from: Q */
    public void m65534Q(b bVar) {
        this.f61275t = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f61273r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((MediaItem) this.f61273r.get(i11)).mo41090x();
    }
}

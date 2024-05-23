package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c20.C3226p;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import ln0.AbstractC22543l;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25066x0;
import q20.C25083f;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27410e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SurveyVideoItem extends FrameLayout {

    /* renamed from: A */
    private final int f50970A;

    /* renamed from: B */
    private int f50971B;

    /* renamed from: C */
    private final ArrayList f50972C;

    /* renamed from: D */
    private C25066x0 f50973D;

    /* renamed from: p */
    private InterfaceC9667a f50974p;

    /* renamed from: q */
    private final int f50975q;

    /* renamed from: r */
    private final int f50976r;

    /* renamed from: s */
    private final int f50977s;

    /* renamed from: t */
    private final int f50978t;

    /* renamed from: u */
    private final int f50979u;

    /* renamed from: v */
    private final int f50980v;

    /* renamed from: w */
    private final int f50981w;

    /* renamed from: x */
    private final int f50982x;

    /* renamed from: y */
    private final int f50983y;

    /* renamed from: z */
    private final float f50984z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9667a {
        /* renamed from: a */
        void mo52384a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem$b */
    /* loaded from: classes5.dex */
    public static final class C9668b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C25066x0 f50985l1;

        /* renamed from: m1 */
        final /* synthetic */ SurveyVideoItem f50986m1;

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f50987t;

            /* renamed from: u */
            private /* synthetic */ Object f50988u;

            /* renamed from: v */
            final /* synthetic */ Bitmap f50989v;

            /* renamed from: w */
            final /* synthetic */ SurveyVideoItem f50990w;

            /* renamed from: x */
            final /* synthetic */ C25066x0 f50991x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32733a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f50992t;

                /* renamed from: u */
                final /* synthetic */ C25066x0 f50993u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f50994v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32733a(C25066x0 c25066x0, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f50993u = c25066x0;
                    this.f50994v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32733a(this.f50993u, this.f50994v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f50992t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f50993u.f120408q.setImageBitmap(this.f50994v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32733a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, SurveyVideoItem surveyVideoItem, C25066x0 c25066x0, Continuation continuation) {
                super(2, continuation);
                this.f50989v = bitmap;
                this.f50990w = surveyVideoItem;
                this.f50991x = c25066x0;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f50989v, this.f50990w, this.f50991x, continuation);
                aVar.f50988u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                CoroutineScope coroutineScope2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f50987t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope2 = (CoroutineScope) this.f50988u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f50988u;
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f50989v, 100.0f);
                    if (m130014a != null) {
                        SurveyVideoItem surveyVideoItem = this.f50990w;
                        C25066x0 c25066x0 = this.f50991x;
                        c25083f.m130015c(m130014a, surveyVideoItem.f50970A);
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32733a c32733a = new C32733a(c25066x0, m130014a, null);
                        this.f50988u = coroutineScope;
                        this.f50987t = 1;
                        if (BuildersKt.m112534g(m112681c, c32733a, this) == m142578e) {
                            return m142578e;
                        }
                        coroutineScope2 = coroutineScope;
                    }
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                    return C24848g0.f119245a;
                }
                coroutineScope = coroutineScope2;
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9668b(C25066x0 c25066x0, SurveyVideoItem surveyVideoItem) {
            this.f50985l1 = c25066x0;
            this.f50986m1 = surveyVideoItem;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                C25066x0 c25066x0 = this.f50985l1;
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, this.f50986m1, c25066x0, null), 3, null);
                c25066x0.f120409r.setImageBitmap(m18839c);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.SurveyVideoItem$c */
    /* loaded from: classes5.dex */
    static final class C9669c extends AbstractC19075u implements InterfaceC18505l {
        C9669c() {
            super(1);
        }

        /* renamed from: a */
        public final void m52387a(View view) {
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.BreakSlot.Option");
            ((BreakSlot.Option) tag).m50703d(true);
            InterfaceC9667a callback = SurveyVideoItem.this.getCallback();
            if (callback != null) {
                callback.mo52384a();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52387a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyVideoItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50975q = AbstractC26112n.m134365F(this);
        this.f50976r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f50977s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f50978t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_padding);
        this.f50979u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_qna_btn_margin);
        this.f50980v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_qna_btn_height);
        this.f50981w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_qna_btn_spacing);
        this.f50982x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_survey_thumb_to_question);
        this.f50983y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_survey_question_to_answers);
        this.f50984z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_radius_8dp);
        this.f50970A = AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain);
        this.f50972C = new ArrayList();
    }

    /* renamed from: b */
    public final void m52383b(BreakSlot breakSlot) {
        AbstractC19074t.m100208f(breakSlot, "survey");
        C25066x0 c25066x0 = this.f50973D;
        if (c25066x0 == null) {
            AbstractC19074t.m100223u("binding");
            c25066x0 = null;
        }
        c25066x0.f120408q.setImageDrawable(null);
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(c25066x0.f120409r);
        c23528a.m123599d();
        c25066x0.f120410s.setText(breakSlot.m50689j());
        ArrayList arrayList = this.f50972C;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List<BreakSlot.Option> m50685f = breakSlot.m50685f();
        if (m50685f == null) {
            m50685f = AbstractC25368s.m131502j();
        }
        for (BreakSlot.Option option : m50685f) {
            View m134372M = AbstractC26112n.m134372M(this, AbstractC27410e.zch_item_video_survey_option, false, 2, null);
            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) m134372M;
            textView.setTag(option);
            textView.setText(option.m50701b());
            AbstractC26112n.m134407k0(textView, new C9669c());
            this.f50972C.add(m134372M);
            addView(m134372M);
        }
    }

    public final InterfaceC9667a getCallback() {
        return this.f50974p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25066x0 m129971a = C25066x0.m129971a(this);
        AbstractC19074t.m100207e(m129971a, "bind(...)");
        m129971a.f120409r.m55955j(this.f50984z, RoundedImageView.EnumC10755b.f54377p);
        this.f50973D = m129971a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25066x0 c25066x0 = this.f50973D;
        if (c25066x0 == null) {
            AbstractC19074t.m100223u("binding");
            c25066x0 = null;
        }
        RecyclingImageView recyclingImageView = c25066x0.f120408q;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134383X(recyclingImageView, 0, 0);
        int measuredWidth = (getMeasuredWidth() - c25066x0.f120409r.getMeasuredWidth()) / 2;
        int i15 = this.f50971B;
        RoundedImageView roundedImageView = c25066x0.f120409r;
        AbstractC19074t.m100207e(roundedImageView, "rivThumbnail");
        AbstractC26112n.m134383X(roundedImageView, i15, measuredWidth);
        int measuredWidth2 = (getMeasuredWidth() - c25066x0.f120410s.getMeasuredWidth()) / 2;
        int measuredHeight = i15 + c25066x0.f120409r.getMeasuredHeight() + this.f50982x;
        SimpleShadowTextView simpleShadowTextView = c25066x0.f120410s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtQuestion");
        AbstractC26112n.m134383X(simpleShadowTextView, measuredHeight, measuredWidth2);
        int i16 = this.f50979u;
        int measuredHeight2 = measuredHeight + c25066x0.f120410s.getMeasuredHeight() + this.f50983y;
        Iterator it = this.f50972C.iterator();
        while (it.hasNext()) {
            AbstractC26112n.m134383X((TextView) it.next(), measuredHeight2, i16);
            measuredHeight2 += this.f50980v + this.f50981w;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25066x0 c25066x0 = this.f50973D;
        if (c25066x0 == null) {
            AbstractC19074t.m100223u("binding");
            c25066x0 = null;
        }
        int i13 = this.f50976r;
        int i14 = this.f50978t;
        int i15 = i13 + i14;
        this.f50971B = i15;
        int i16 = size - (this.f50979u * 2);
        int i17 = (size2 - i15) - (i14 * 2);
        C3226p.a aVar = C3226p.Companion;
        if (aVar.m16363f()) {
            int i18 = this.f50971B;
            int i19 = this.f50975q;
            this.f50971B = i18 + i19;
            i17 -= i19;
        }
        if (aVar.m16362e()) {
            i17 -= this.f50977s;
        }
        if (!this.f50972C.isEmpty()) {
            Iterator it = this.f50972C.iterator();
            while (it.hasNext()) {
                AbstractC26112n.m134387a0((TextView) it.next(), i16, 1073741824, this.f50980v, 1073741824);
                i17 -= this.f50980v + this.f50981w;
            }
            i17 = (i17 + this.f50981w) - this.f50983y;
        }
        SimpleShadowTextView simpleShadowTextView = c25066x0.f120410s;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtQuestion");
        AbstractC26112n.m134387a0(simpleShadowTextView, (i16 * 3) / 4, 1073741824, 0, 0);
        int measuredHeight = i17 - (c25066x0.f120410s.getMeasuredHeight() + this.f50982x);
        int i21 = size / 3;
        int i22 = (i21 / 2) * 3;
        if (i22 > measuredHeight) {
            i22 = AbstractC22543l.m116580c(measuredHeight, 0);
            i21 = (i22 / 3) * 2;
        } else {
            this.f50971B += (measuredHeight / 3) - (i22 / 3);
        }
        RoundedImageView roundedImageView = c25066x0.f120409r;
        AbstractC19074t.m100207e(roundedImageView, "rivThumbnail");
        AbstractC26112n.m134387a0(roundedImageView, i21, 1073741824, i22, 1073741824);
        RecyclingImageView recyclingImageView = c25066x0.f120408q;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, size2, 1073741824);
        setMeasuredDimension(size, size2);
    }

    public final void setCallback(InterfaceC9667a interfaceC9667a) {
        this.f50974p = interfaceC9667a;
    }
}

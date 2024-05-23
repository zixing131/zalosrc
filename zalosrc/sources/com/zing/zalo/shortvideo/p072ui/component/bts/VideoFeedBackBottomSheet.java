package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.ContentFeedback;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.component.bts.VideoFeedBackBottomSheet;
import com.zing.zalo.shortvideo.p072ui.widget.FlexBoxLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p133ek.AbstractC18458a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25011h;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class VideoFeedBackBottomSheet extends BaseBottomSheetView {
    public static final C9531b Companion = new C9531b(null);

    /* renamed from: M0 */
    private C25011h f50488M0;

    /* renamed from: N0 */
    private InterfaceC9530a f50489N0;

    /* renamed from: O0 */
    private List f50490O0 = new ArrayList();

    /* renamed from: P0 */
    private List f50491P0 = new ArrayList();

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoFeedBackBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9530a {
        /* renamed from: a */
        void mo51967a(List list, List list2);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoFeedBackBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9531b {
        private C9531b() {
        }

        public /* synthetic */ C9531b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final VideoFeedBackBottomSheet m51968a(String str) {
            AbstractC19074t.m100208f(str, "hashtag");
            VideoFeedBackBottomSheet videoFeedBackBottomSheet = new VideoFeedBackBottomSheet();
            videoFeedBackBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("HASH_TAG", str)));
            return videoFeedBackBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.VideoFeedBackBottomSheet$c */
    /* loaded from: classes5.dex */
    static final class C9532c extends AbstractC19075u implements InterfaceC18505l {
        C9532c() {
            super(1);
        }

        /* renamed from: a */
        public final void m51969a(View view) {
            AbstractC19074t.m100208f(view, "it");
            if ((!VideoFeedBackBottomSheet.this.f50490O0.isEmpty()) || (!VideoFeedBackBottomSheet.this.f50491P0.isEmpty())) {
                InterfaceC9530a m51965mL = VideoFeedBackBottomSheet.this.m51965mL();
                if (m51965mL != null) {
                    m51965mL.mo51967a(VideoFeedBackBottomSheet.this.f50490O0, VideoFeedBackBottomSheet.this.f50491P0);
                }
                VideoFeedBackBottomSheet.this.dismiss();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51969a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nL */
    public static final void m51962nL(SimpleShadowTextView simpleShadowTextView, VideoFeedBackBottomSheet videoFeedBackBottomSheet, View view) {
        AbstractC19074t.m100208f(simpleShadowTextView, "$view");
        AbstractC19074t.m100208f(videoFeedBackBottomSheet, "this$0");
        Object tag = simpleShadowTextView.getTag();
        Boolean bool = Boolean.TRUE;
        if (AbstractC19074t.m100204b(tag, bool)) {
            simpleShadowTextView.setTag(Boolean.FALSE);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_primary);
            videoFeedBackBottomSheet.f50490O0.remove(simpleShadowTextView.getText().toString());
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round);
        } else {
            simpleShadowTextView.setTag(bool);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_accent_blue);
            videoFeedBackBottomSheet.f50490O0.add(simpleShadowTextView.getText().toString());
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round_selected);
        }
        videoFeedBackBottomSheet.m51964qL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oL */
    public static final void m51963oL(SimpleShadowTextView simpleShadowTextView, VideoFeedBackBottomSheet videoFeedBackBottomSheet, ContentFeedback contentFeedback, View view) {
        AbstractC19074t.m100208f(simpleShadowTextView, "$view");
        AbstractC19074t.m100208f(videoFeedBackBottomSheet, "this$0");
        AbstractC19074t.m100208f(contentFeedback, "$feedback");
        Object tag = simpleShadowTextView.getTag();
        Boolean bool = Boolean.TRUE;
        if (AbstractC19074t.m100204b(tag, bool)) {
            simpleShadowTextView.setTag(Boolean.FALSE);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_primary);
            List list = videoFeedBackBottomSheet.f50491P0;
            AbstractC19069o0.m100184a(list).remove(contentFeedback.m51435b());
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round);
        } else {
            simpleShadowTextView.setTag(bool);
            AbstractC26112n.m134425t0(simpleShadowTextView, AbstractC27406a.zch_text_accent_blue);
            Integer m51435b = contentFeedback.m51435b();
            if (m51435b != null) {
                videoFeedBackBottomSheet.f50491P0.add(Integer.valueOf(m51435b.intValue()));
            }
            simpleShadowTextView.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round_selected);
        }
        videoFeedBackBottomSheet.m51964qL();
    }

    /* renamed from: qL */
    private final void m51964qL() {
        SimpleShadowTextView simpleShadowTextView;
        SimpleShadowTextView simpleShadowTextView2;
        if (this.f50490O0.isEmpty() && this.f50491P0.isEmpty()) {
            C25011h c25011h = this.f50488M0;
            if (c25011h != null && (simpleShadowTextView2 = c25011h.f119928q) != null) {
                AbstractC26112n.m134368I(simpleShadowTextView2);
                return;
            }
            return;
        }
        C25011h c25011h2 = this.f50488M0;
        if (c25011h2 != null && (simpleShadowTextView = c25011h2.f119928q) != null) {
            AbstractC26112n.m134396f(simpleShadowTextView);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51756aL(true);
        m51753XK(true);
        m51754YK(0.5f);
        m51760eL(0.8f);
        m51761fL(true);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        List<ContentFeedback> list;
        String m51434a;
        boolean m127128x;
        List<String> m127132B0;
        CoreConfig m51425b;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C25011h m129829c = C25011h.m129829c(layoutInflater, viewGroup, false);
        this.f50488M0 = m129829c;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("HASH_TAG");
        } else {
            str = null;
        }
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51425b = m140381e.m51425b()) != null) {
            list = m51425b.m51441d();
        } else {
            list = null;
        }
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                SimpleShadowTextView simpleShadowTextView = m129829c.f119933v;
                AbstractC19074t.m100207e(simpleShadowTextView, "tvTitleHashtag");
                AbstractC26112n.m134431w0(simpleShadowTextView);
                FlexBoxLayout flexBoxLayout = m129829c.f119929r;
                AbstractC19074t.m100207e(flexBoxLayout, "flexBox");
                AbstractC26112n.m134431w0(flexBoxLayout);
                m127132B0 = AbstractC24342w.m127132B0(str, new String[]{","}, false, 0, 6, null);
                for (String str2 : m127132B0) {
                    FlexBoxLayout flexBoxLayout2 = m129829c.f119929r;
                    AbstractC19074t.m100207e(flexBoxLayout2, "flexBox");
                    View m134372M = AbstractC26112n.m134372M(flexBoxLayout2, AbstractC27410e.zch_item_feed_back_hashtag, false, 2, null);
                    AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.tv.SimpleShadowTextView");
                    final SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) m134372M;
                    simpleShadowTextView2.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round);
                    AbstractC26112n.m134425t0(simpleShadowTextView2, AbstractC27406a.zch_text_primary);
                    simpleShadowTextView2.setText(str2);
                    simpleShadowTextView2.setTag(Boolean.FALSE);
                    simpleShadowTextView2.setOnClickListener(new View.OnClickListener() { // from class: v10.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            VideoFeedBackBottomSheet.m51962nL(SimpleShadowTextView.this, this, view);
                        }
                    });
                    m129829c.f119929r.addView(simpleShadowTextView2);
                }
                m129829c.f119929r.requestLayout();
            }
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            FlexBoxLayout flexBoxLayout3 = m129829c.f119930s;
            AbstractC19074t.m100207e(flexBoxLayout3, "flexBoxFeedBack");
            AbstractC26112n.m134431w0(flexBoxLayout3);
            SimpleShadowTextView simpleShadowTextView3 = m129829c.f119932u;
            AbstractC19074t.m100207e(simpleShadowTextView3, "tvTitleFeedBack");
            AbstractC26112n.m134431w0(simpleShadowTextView3);
            for (final ContentFeedback contentFeedback : list) {
                FlexBoxLayout flexBoxLayout4 = m129829c.f119930s;
                AbstractC19074t.m100207e(flexBoxLayout4, "flexBoxFeedBack");
                View m134372M2 = AbstractC26112n.m134372M(flexBoxLayout4, AbstractC27410e.zch_item_feed_back_hashtag, false, 2, null);
                AbstractC19074t.m100206d(m134372M2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.tv.SimpleShadowTextView");
                final SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) m134372M2;
                simpleShadowTextView4.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive_round);
                AbstractC26112n.m134425t0(simpleShadowTextView4, AbstractC27406a.zch_text_primary);
                if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                    m51434a = contentFeedback.m51436c();
                } else {
                    m51434a = contentFeedback.m51434a();
                }
                simpleShadowTextView4.setText(m51434a);
                simpleShadowTextView4.setTag(Boolean.FALSE);
                simpleShadowTextView4.setOnClickListener(new View.OnClickListener() { // from class: v10.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VideoFeedBackBottomSheet.m51963oL(SimpleShadowTextView.this, this, contentFeedback, view);
                    }
                });
                m129829c.f119930s.addView(simpleShadowTextView4);
            }
            m129829c.f119930s.requestLayout();
        }
        SimpleShadowTextView simpleShadowTextView5 = m129829c.f119928q;
        AbstractC19074t.m100207e(simpleShadowTextView5, "btnAction");
        AbstractC26112n.m134407k0(simpleShadowTextView5, new C9532c());
        m51964qL();
        LinearLayout root = m129829c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: mL */
    public final InterfaceC9530a m51965mL() {
        return this.f50489N0;
    }

    /* renamed from: pL */
    public final void m51966pL(InterfaceC9530a interfaceC9530a) {
        this.f50489N0 = interfaceC9530a;
    }
}

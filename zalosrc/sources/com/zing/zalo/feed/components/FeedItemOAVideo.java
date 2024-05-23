package com.zing.zalo.feed.components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import gg0.AbstractC19444a;
import java.net.URI;
import java.util.List;
import me0.C23212s8;
import p363nh.C23744a;
import p394oj.C24278d;
import p716zh.C31840a7;
import p716zh.C31869c6;
import p716zh.C32106s7;

/* loaded from: classes4.dex */
public class FeedItemOAVideo extends FeedItemVideo implements C31840a7.g {

    /* renamed from: O0 */
    TextView f44546O0;

    /* renamed from: P0 */
    TextView f44547P0;

    /* renamed from: Q0 */
    Button f44548Q0;

    /* renamed from: R0 */
    ImageView f44549R0;

    /* renamed from: S0 */
    C32106s7 f44550S0;

    /* renamed from: T0 */
    String f44551T0;

    /* renamed from: U0 */
    String f44552U0;

    /* renamed from: V0 */
    String f44553V0;

    /* renamed from: W0 */
    String f44554W0;

    /* renamed from: X0 */
    String f44555X0;

    public FeedItemOAVideo(Context context) {
        super(context);
        this.f44551T0 = "";
        this.f44552U0 = "";
        this.f44553V0 = "";
        this.f44554W0 = "";
        this.f44555X0 = "";
    }

    /* renamed from: G0 */
    public /* synthetic */ void m43889G0() {
        m44209Z(false, null);
        C23744a.m124114c().m124116d(54, new Object[0]);
    }

    /* renamed from: H0 */
    public /* synthetic */ void m43890H0(boolean z11) {
        if (z11) {
            try {
                m43893F0(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: I0 */
    public /* synthetic */ void m43891I0(InterfaceC2259a interfaceC2259a, View view) {
        try {
            if (!TextUtils.isEmpty(this.f44553V0) && interfaceC2259a != null) {
                FeedActionZUtils.m47527O(this.f44553V0, this.f44859C0, FeedActionZUtils.m47565w(this.f44296f0), interfaceC2259a);
            }
        } catch (ActivityNotFoundException unused) {
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11933RC(this.f44553V0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J0 */
    public /* synthetic */ void m43892J0(InterfaceC2259a interfaceC2259a, LinkAttachment linkAttachment, View view) {
        if (interfaceC2259a != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bol_share_in_app", true);
                bundle.putString("linktoShare", this.f44553V0);
                bundle.putString("subjectForLink", this.f44551T0);
                C3020p0 c3020p0 = this.f44859C0;
                if (c3020p0 != null && c3020p0.m14479H()) {
                    bundle.putString("footer_action_v2", this.f44859C0.f12024D.m14623h().toString());
                }
                bundle.putParcelable("shareLinkAttachment", linkAttachment);
                interfaceC2259a.mo11967rA(bundle);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: F0 */
    void m43893F0(boolean z11) {
        boolean z12;
        C32106s7 c32106s7 = this.f44550S0;
        if (c32106s7 != null) {
            String m154977f = c32106s7.m154977f();
            String m154975d = this.f44550S0.m154975d();
            C24278d m152979g = C31840a7.m152973c().m152979g(m154977f, m154975d);
            if (m152979g != null && !m152979g.m126783a()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z11 && z12) {
                C31840a7.m152973c().m152976d(m154977f, new String[]{m154975d}, this);
                return;
            }
            this.f44550S0.m154980i(m152979g);
            if (!z11 && !z12) {
                mo43894b0();
                post(new Runnable() { // from class: com.zing.zalo.feed.components.d3
                    public /* synthetic */ RunnableC8255d3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedItemOAVideo.this.m43889G0();
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo
    /* renamed from: b0 */
    protected C17391z mo43894b0() {
        C32106s7 c32106s7 = this.f44550S0;
        if (c32106s7 != null) {
            return c32106s7.m154978g();
        }
        return null;
    }

    @Override // p716zh.C31840a7.g
    /* renamed from: ds */
    public void mo43895ds(String str, String[] strArr, boolean z11) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.feed.components.a3

            /* renamed from: q */
            public final /* synthetic */ boolean f45166q;

            public /* synthetic */ RunnableC8228a3(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FeedItemOAVideo.this.m43890H0(r2);
            }
        });
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo
    /* renamed from: f0 */
    protected void mo43896f0(Context context, int i11) {
        boolean z11;
        try {
            this.f44296f0 = i11;
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            int i12 = this.f44296f0;
            if (i12 == 0) {
                layoutInflater.inflate(AbstractC7409c0.feed_item_oa_video_content, this);
                z11 = true;
            } else {
                if (i12 == 4) {
                    layoutInflater.inflate(AbstractC7409c0.feed_item_oa_video_content_detail, this);
                }
                z11 = false;
            }
            ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.zaloVideoViewBig);
            this.f44871r0 = zVideoView;
            if (zVideoView != null) {
                zVideoView.getVideoController().f88210s.f88566d0 = AbstractC16803z.icn_csc_play_big_selector;
                this.f44871r0.getVideoController().f88210s.f88567e0 = AbstractC16803z.icn_csc_play_big_selector;
            }
            this.f44546O0 = (TextView) findViewById(AbstractC6918a0.tvLinkTitleBig);
            this.f44547P0 = (TextView) findViewById(AbstractC6918a0.tvLinkDescriptionBig);
            this.f44548Q0 = (Button) findViewById(AbstractC6918a0.btnShareLinkBig);
            this.f44549R0 = (ImageView) findViewById(AbstractC6918a0.icShareLinkBig);
            if (z11) {
                setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo, com.zing.zalo.feed.components.FeedItemBase
    public List<Integer> getArrIdsListCallback() {
        List<Integer> arrIdsListCallback = super.getArrIdsListCallback();
        arrIdsListCallback.add(6);
        return arrIdsListCallback;
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo
    public void setFeedItem(C3020p0 c3020p0) {
        super.setFeedItem(c3020p0);
        this.f44550S0 = C32106s7.m154973b(this.f44859C0);
        m43893F0(true);
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo, com.zing.zalo.feed.components.FeedItemBase
    public void setListListener(SparseArray<View.OnClickListener> sparseArray) {
        super.setListListener(sparseArray);
        setOnVideoViewClickListener(sparseArray.get(6));
    }

    @Override // com.zing.zalo.feed.components.FeedItemVideo
    /* renamed from: w0 */
    public void mo43897w0(C3000l0 c3000l0, int i11, boolean z11, Context context, InterfaceC10867f interfaceC10867f, InterfaceC2259a interfaceC2259a) {
        boolean z12;
        C3025q0.b bVar;
        int i12;
        C3025q0 c3025q0;
        super.mo43897w0(c3000l0, i11, z11, context, interfaceC10867f, interfaceC2259a);
        C3020p0 c3020p0 = this.f44859C0;
        int i13 = 0;
        if (c3020p0 != null && c3020p0.m14479H()) {
            z12 = true;
        } else {
            z12 = false;
        }
        String str = "";
        this.f44551T0 = "";
        this.f44552U0 = "";
        this.f44553V0 = "";
        this.f44554W0 = "";
        this.f44555X0 = "";
        C3020p0 c3020p02 = this.f44859C0;
        C31869c6 c31869c6 = null;
        if (c3020p02 != null && (c3025q0 = c3020p02.f12023C) != null) {
            bVar = c3025q0.f12134y;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            this.f44551T0 = bVar.f12138a;
            this.f44553V0 = bVar.f12141d;
            this.f44555X0 = bVar.f12142e;
            this.f44554W0 = bVar.f12139b;
        }
        if (!TextUtils.isEmpty(this.f44555X0)) {
            str = this.f44555X0;
        } else if (!TextUtils.isEmpty(this.f44553V0)) {
            try {
                URI uri = new URI(this.f44553V0);
                if (!TextUtils.isEmpty(uri.getHost())) {
                    str = uri.getHost();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        ViewOnClickListenerC8237b3 viewOnClickListenerC8237b3 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.b3

            /* renamed from: q */
            public final /* synthetic */ InterfaceC2259a f45186q;

            public /* synthetic */ ViewOnClickListenerC8237b3(InterfaceC2259a interfaceC2259a2) {
                r2 = interfaceC2259a2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemOAVideo.this.m43891I0(r2, view);
            }
        };
        LinkAttachment linkAttachment = new LinkAttachment();
        linkAttachment.f42625q = this.f44551T0;
        linkAttachment.f42624p = this.f44553V0;
        linkAttachment.f42626r = this.f44554W0;
        linkAttachment.f42628t = str;
        C32106s7 c32106s7 = this.f44550S0;
        if (c32106s7 != null) {
            c31869c6 = c32106s7.f148003a;
        }
        linkAttachment.f42630v = c31869c6;
        ViewOnClickListenerC8246c3 viewOnClickListenerC8246c3 = new View.OnClickListener() { // from class: com.zing.zalo.feed.components.c3

            /* renamed from: q */
            public final /* synthetic */ InterfaceC2259a f45269q;

            /* renamed from: r */
            public final /* synthetic */ LinkAttachment f45270r;

            public /* synthetic */ ViewOnClickListenerC8246c3(InterfaceC2259a interfaceC2259a2, LinkAttachment linkAttachment2) {
                r2 = interfaceC2259a2;
                r3 = linkAttachment2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemOAVideo.this.m43892J0(r2, r3, view);
            }
        };
        TextView textView = this.f44546O0;
        if (textView != null) {
            textView.setText(this.f44551T0);
            this.f44546O0.setOnClickListener(viewOnClickListenerC8237b3);
        }
        TextView textView2 = this.f44547P0;
        if (textView2 != null) {
            textView2.setText(this.f44552U0);
        }
        Button button = this.f44548Q0;
        if (button != null) {
            button.setOnClickListener(viewOnClickListenerC8246c3);
            Button button2 = this.f44548Q0;
            if (z12) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            button2.setVisibility(i12);
        }
        ImageView imageView = this.f44549R0;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC8246c3);
            ImageView imageView2 = this.f44549R0;
            if (!z12) {
                i13 = 8;
            }
            imageView2.setVisibility(i13);
        }
        setOnClickListener(viewOnClickListenerC8237b3);
    }

    public FeedItemOAVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44551T0 = "";
        this.f44552U0 = "";
        this.f44553V0 = "";
        this.f44554W0 = "";
        this.f44555X0 = "";
    }
}

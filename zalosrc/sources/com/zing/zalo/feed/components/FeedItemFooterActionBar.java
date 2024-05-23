package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public class FeedItemFooterActionBar extends RelativeLayout {

    /* renamed from: p */
    private AspectRatioImageView f44387p;

    /* renamed from: q */
    private TextView f44388q;

    /* renamed from: r */
    private TextView f44389r;

    /* renamed from: s */
    private TextView f44390s;

    /* renamed from: t */
    private C23528a f44391t;

    /* renamed from: u */
    private LinearLayout f44392u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.FeedItemFooterActionBar$a */
    /* loaded from: classes4.dex */
    public class C8089a extends ViewOutlineProvider {
        C8089a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC23136l9.m118742r(6.0f));
        }
    }

    public FeedItemFooterActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43743a(context);
    }

    /* renamed from: a */
    private void m43743a(Context context) {
        this.f44391t = new C23528a(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_footer_action_content, this);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(AbstractC6918a0.imv_thumb);
        this.f44387p = aspectRatioImageView;
        aspectRatioImageView.setScaleOption(1);
        this.f44388q = (TextView) findViewById(AbstractC6918a0.tv_title);
        this.f44389r = (TextView) findViewById(AbstractC6918a0.tv_desc);
        this.f44390s = (TextView) findViewById(AbstractC6918a0.btn_action);
        this.f44392u = (LinearLayout) findViewById(AbstractC6918a0.layoutTitle);
        try {
            this.f44387p.setOutlineProvider(new C8089a());
            this.f44387p.setClipToOutline(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        setClickable(true);
        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
    }
}

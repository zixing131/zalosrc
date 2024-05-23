package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public class PickMediaProgressView extends LinearLayout {

    /* renamed from: p */
    private ProgressBar f75916p;

    /* renamed from: q */
    private View f75917q;

    /* renamed from: r */
    private TextSwitcher f75918r;

    public PickMediaProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82605b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ View m82604c() {
        RobotoTextView robotoTextView = new RobotoTextView(this.f75918r.getContext());
        robotoTextView.setGravity(51);
        robotoTextView.setTextColor(C23212s8.m119607o(this.f75918r.getContext(), AbstractC21196a.TextColor1));
        robotoTextView.setTextSize(14.0f);
        return robotoTextView;
    }

    /* renamed from: b */
    void m82605b(Context context) {
        View.inflate(context, AbstractC7409c0.pick_media_progress_view, this);
        this.f75916p = (ProgressBar) findViewById(AbstractC6918a0.upload_progress_bar);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(AbstractC6918a0.txt_status);
        this.f75918r = textSwitcher;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.zing.zalo.ui.zviews.t40
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View m82604c;
                m82604c = PickMediaProgressView.this.m82604c();
                return m82604c;
            }
        });
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in_short);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_out_short);
        this.f75918r.setInAnimation(loadAnimation);
        this.f75918r.setOutAnimation(loadAnimation2);
        this.f75917q = findViewById(AbstractC6918a0.btn_cancel_upload);
    }

    /* renamed from: d */
    public void m82606d(int i11) {
        ProgressBar progressBar = this.f75916p;
        if (progressBar != null) {
            progressBar.setProgress(i11);
        }
    }

    public PickMediaProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m82605b(context);
    }
}

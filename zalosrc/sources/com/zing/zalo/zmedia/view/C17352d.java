package com.zing.zalo.zmedia.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.zplayer.C17395R;

/* renamed from: com.zing.zalo.zmedia.view.d */
/* loaded from: classes7.dex */
public class C17352d extends ViewOnClickListenerC17374o {

    /* renamed from: n0 */
    TextView f88491n0;

    /* renamed from: o0 */
    public boolean f88492o0 = false;

    public C17352d() {
        int i11 = C17395R.drawable.ic_play_preview_video;
        this.f88566d0 = i11;
        this.f88567e0 = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o
    /* renamed from: A */
    public void mo92477A(boolean z11, boolean z12) {
        int i11;
        boolean z13;
        int i12;
        ViewGroup viewGroup = this.f88583w;
        boolean z14 = true;
        int i13 = 4;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            ViewGroup viewGroup2 = this.f88583w;
            if (z11) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            AbstractC17358g.m92498k(viewGroup2, i12);
            if (z12 && ((z11 && !z13) || (!z11 && z13))) {
                m92514g(this.f88583w, z11);
            }
        }
        ViewGroup viewGroup3 = this.f88584x;
        if (viewGroup3 != null) {
            if (viewGroup3.getVisibility() != 0) {
                z14 = false;
            }
            ViewGroup viewGroup4 = this.f88584x;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            AbstractC17358g.m92498k(viewGroup4, i11);
            TextView textView = this.f88491n0;
            if (z11 && this.f88492o0) {
                i13 = 0;
            }
            AbstractC17358g.m92498k(textView, i13);
            if (z12) {
                if ((z11 && !z14) || (!z11 && z14)) {
                    m92513f(this.f88584x, z11);
                    TextView textView2 = this.f88491n0;
                    if (textView2 != null && this.f88492o0) {
                        m92513f(textView2, z11);
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o
    /* renamed from: d */
    public void mo92478d(View view) {
        super.mo92478d(view);
        this.f88491n0 = (TextView) view.findViewById(C17395R.id.video_inline_tv_video_duration);
    }

    @Override // com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o
    /* renamed from: y */
    public void mo92479y(C17391z c17391z) {
        long j11;
        super.mo92479y(c17391z);
        C17391z c17391z2 = this.f88575m0;
        if (c17391z2 != null) {
            j11 = c17391z2.f88632o;
        } else {
            j11 = 0;
        }
        if (this.f88491n0 != null) {
            this.f88491n0.setText(m92506G((int) j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o
    /* renamed from: z */
    public void mo92480z(boolean z11) {
        int i11;
        TextView textView;
        super.mo92480z(z11);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        ViewGroup viewGroup = this.f88584x;
        if (viewGroup != null) {
            i11 = viewGroup.getVisibility();
        }
        if (this.f88492o0 && (textView = this.f88491n0) != null) {
            textView.setVisibility(i11);
        }
    }
}

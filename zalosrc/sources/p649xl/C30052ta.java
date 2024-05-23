package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBackupInfoV2View;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ta */
/* loaded from: classes3.dex */
public final class C30052ta implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139465p;

    /* renamed from: q */
    public final SyncBackupInfoV2View f139466q;

    /* renamed from: r */
    public final RobotoTextView f139467r;

    /* renamed from: s */
    public final TrackingTextView f139468s;

    /* renamed from: t */
    public final RobotoTextView f139469t;

    private C30052ta(LinearLayout linearLayout, SyncBackupInfoV2View syncBackupInfoV2View, RobotoTextView robotoTextView, TrackingTextView trackingTextView, RobotoTextView robotoTextView2) {
        this.f139465p = linearLayout;
        this.f139466q = syncBackupInfoV2View;
        this.f139467r = robotoTextView;
        this.f139468s = trackingTextView;
        this.f139469t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30052ta m148536a(View view) {
        int i11 = AbstractC6918a0.backup_info_view;
        SyncBackupInfoV2View syncBackupInfoV2View = (SyncBackupInfoV2View) AbstractC22716b.m117526a(view, i11);
        if (syncBackupInfoV2View != null) {
            i11 = AbstractC6918a0.btn_ignore;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.btn_restore;
                TrackingTextView trackingTextView = (TrackingTextView) AbstractC22716b.m117526a(view, i11);
                if (trackingTextView != null) {
                    i11 = AbstractC6918a0.tv_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30052ta((LinearLayout) view, syncBackupInfoV2View, robotoTextView, trackingTextView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30052ta m148537c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.restore_message_startup_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148536a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139465p;
    }
}

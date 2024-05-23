package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.AbstractC24866w;
import q10.C24991c;
import v00.AbstractC27408c;

/* loaded from: classes5.dex */
public final class CommentUserBottomSheet extends BaseBottomSheetView {
    public static final C9506b Companion = new C9506b(null);

    /* renamed from: M0 */
    private InterfaceC9505a f50440M0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentUserBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9505a {
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.CommentUserBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9506b {
        private C9506b() {
        }

        public /* synthetic */ C9506b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CommentUserBottomSheet m51879a(Comment.Identity identity) {
            AbstractC19074t.m100208f(identity, "user");
            CommentUserBottomSheet commentUserBottomSheet = new CommentUserBottomSheet();
            commentUserBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("USER", identity)));
            return commentUserBottomSheet;
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Comment.Identity identity;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C24991c m129770c = C24991c.m129770c(layoutInflater, viewGroup, false);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (identity = (Comment.Identity) m92642L3.getParcelable("USER")) != null) {
            AvatarImageView avatarImageView = m129770c.f119804q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, identity.m50854d(), identity.m50855e(), identity.m50853c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
            m129770c.f119805r.setText(identity.m50855e());
        }
        LinearLayout root = m129770c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: iL */
    public final void m51878iL(InterfaceC9505a interfaceC9505a) {
        this.f50440M0 = interfaceC9505a;
    }
}

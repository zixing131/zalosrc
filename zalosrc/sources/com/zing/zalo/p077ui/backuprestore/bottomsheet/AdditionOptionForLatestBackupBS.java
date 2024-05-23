package com.zing.zalo.p077ui.backuprestore.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.p077ui.backuprestore.bottomsheet.AdditionOptionForLatestBackupBS;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import p649xl.C29791f;
import pm0.C24848g0;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class AdditionOptionForLatestBackupBS extends BottomSheet {

    /* renamed from: b1 */
    private C29791f f55506b1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.bottomsheet.AdditionOptionForLatestBackupBS$a */
    /* loaded from: classes5.dex */
    public static final class C10985a extends AbstractC19075u implements InterfaceC18494a {
        C10985a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57137a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57137a() {
            ZaloView m92650VI = AdditionOptionForLatestBackupBS.this.m92650VI();
            if (m92650VI != null) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_REQ_REMOVE_BACKUP_FROM_BOTTOM_SHEET", 1);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92650VI.mo50035CK(-1, intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.bottomsheet.AdditionOptionForLatestBackupBS$b */
    /* loaded from: classes5.dex */
    public static final class C10986b extends AbstractC19075u implements InterfaceC18494a {
        C10986b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57138a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57138a() {
            ZaloView m92650VI = AdditionOptionForLatestBackupBS.this.m92650VI();
            if (m92650VI != null) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_REQ_RESTORE_FROM_BOTTOM_SHEET", 1);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92650VI.mo50035CK(-1, intent);
            }
        }
    }

    /* renamed from: KL */
    private final void m57132KL(InterfaceC18494a interfaceC18494a) {
        interfaceC18494a.mo12V4();
        close();
    }

    /* renamed from: LL */
    private final void m57133LL() {
        C29791f c29791f = this.f55506b1;
        if (c29791f != null) {
            c29791f.f137718s.setOnClickListener(new View.OnClickListener() { // from class: k40.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdditionOptionForLatestBackupBS.m57134ML(AdditionOptionForLatestBackupBS.this, view);
                }
            });
            c29791f.f137719t.setOnClickListener(new View.OnClickListener() { // from class: k40.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdditionOptionForLatestBackupBS.m57135NL(AdditionOptionForLatestBackupBS.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ML */
    public static final void m57134ML(AdditionOptionForLatestBackupBS additionOptionForLatestBackupBS, View view) {
        AbstractC19074t.m100208f(additionOptionForLatestBackupBS, "this$0");
        additionOptionForLatestBackupBS.m57132KL(new C10985a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m57135NL(AdditionOptionForLatestBackupBS additionOptionForLatestBackupBS, View view) {
        AbstractC19074t.m100208f(additionOptionForLatestBackupBS, "this$0");
        additionOptionForLatestBackupBS.m57132KL(new C10986b());
    }

    /* renamed from: OL */
    private final void m57136OL() {
        C29791f c29791f = this.f55506b1;
        if (c29791f != null) {
            c29791f.f137718s.setClickable(true);
            c29791f.f137719t.setClickable(true);
            ZAppCompatImageView zAppCompatImageView = c29791f.f137716q;
            Context context = zAppCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.support_error));
            ZAppCompatImageView zAppCompatImageView2 = c29791f.f137717r;
            Context context2 = zAppCompatImageView2.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_auto_counter_clockwise_line_24, AbstractC2807a.icon_02));
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f55506b1 = C29791f.m147920c(LayoutInflater.from(getContext()), linearLayout, true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(true);
        m57136OL();
        m57133LL();
    }
}

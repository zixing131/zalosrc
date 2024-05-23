package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.location.widget.C8984c;
import mm0.AbstractC23350e;
import p363nh.C23744a;
import zc0.C31784b;

/* loaded from: classes6.dex */
public class LiveLocationSharingListView extends BottomPickerView implements C23744a.c {

    /* renamed from: U0 */
    RecyclerView f74694U0;

    /* renamed from: V0 */
    C8984c f74695V0;

    /* renamed from: W0 */
    Handler f74696W0 = new Handler(Looper.getMainLooper(), new C14518a());

    /* renamed from: X0 */
    LiveLocationSharingListView f74697X0 = this;

    /* renamed from: com.zing.zalo.ui.zviews.LiveLocationSharingListView$a */
    /* loaded from: classes6.dex */
    class C14518a implements Handler.Callback {
        C14518a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C8984c c8984c;
            if (message.what == 1 && LiveLocationSharingListView.this.m92672lJ() && (c8984c = LiveLocationSharingListView.this.f74695V0) != null && c8984c.mo10003k() > 0) {
                LiveLocationSharingListView.this.f74695V0.m10008p();
                LiveLocationSharingListView.this.f74696W0.sendEmptyMessageDelayed(1, 30000L);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rL */
    public /* synthetic */ void m81145rL(int i11) {
        if (i11 == 83) {
            try {
                m81148pL();
                m81149qL();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public /* synthetic */ void m81146sL(RecyclerView recyclerView, int i11, View view) {
        C8969o c8969o;
        try {
            C8984c.f m48069P = this.f74695V0.m48069P(i11);
            if (m48069P.f48107a == 0 && (c8969o = ((C8984c.d) m48069P).f48098b) != null) {
                C8967m.m47888f0(m92676n2(), null, c8969o.f47981b, c8969o.f47980a, c8969o.f47984e, c8969o.f47985f, 6);
                this.f74697X0.dismiss();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tL */
    public static LiveLocationSharingListView m81147tL() {
        Bundle m78535kL = BottomPickerView.m78535kL();
        LiveLocationSharingListView liveLocationSharingListView = new LiveLocationSharingListView();
        liveLocationSharingListView.mo60305zK(m78535kL);
        return liveLocationSharingListView;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C23744a.m124114c().m124115b(this, 83);
        m81148pL();
        m81149qL();
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 83);
        this.f74696W0.removeMessages(1);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.live_location_sharing_list_view;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.live_location_sharing_list_btn_close) {
            this.f74697X0.dismiss();
        } else if (id2 == AbstractC6918a0.live_location_sharing_list_btn_stop_all) {
            C8967m.m47867E().m47936s();
            this.f74697X0.dismiss();
        }
    }

    /* renamed from: pL */
    void m81148pL() {
        this.f74695V0.m48074X(C8967m.m47867E().m47898C(true), false);
        this.f74695V0.m10008p();
        this.f74696W0.removeMessages(1);
        if (!m92681pJ() && this.f74695V0.mo10003k() > 0) {
            this.f74696W0.sendEmptyMessageDelayed(1, 30000L);
        }
    }

    /* renamed from: qL */
    void m81149qL() {
        C8984c c8984c = this.f74695V0;
        if (c8984c == null || c8984c.mo10003k() == 0) {
            finish();
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, Object... objArr) {
        this.f74696W0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.vt
            @Override // java.lang.Runnable
            public final void run() {
                LiveLocationSharingListView.this.m81145rL(i11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f83659I0.findViewById(AbstractC6918a0.live_location_sharing_list_btn_close).setOnClickListener(this);
        this.f83659I0.findViewById(AbstractC6918a0.live_location_sharing_list_btn_stop_all).setOnClickListener(this);
        this.f74694U0 = (RecyclerView) this.f83659I0.findViewById(AbstractC6918a0.live_location_sharing_list);
        this.f74695V0 = new C8984c(2);
        this.f74694U0.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f74694U0.setAdapter(this.f74695V0);
        C31784b.m152808a(this.f74694U0).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.wt
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                LiveLocationSharingListView.this.m81146sL(recyclerView, i11, view);
            }
        });
    }
}

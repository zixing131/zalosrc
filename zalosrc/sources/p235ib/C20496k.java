package p235ib;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.mp3.sdk.view.widgets.SongBtsView;
import fn0.AbstractC19074t;
import p156fb.AbstractC18861g;

/* renamed from: ib.k */
/* loaded from: classes3.dex */
public final class C20496k {

    /* renamed from: a */
    public static final C20496k f100742a = new C20496k();

    private C20496k() {
    }

    /* renamed from: a */
    public static final SongBtsView m106529a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC18861g.zingmp3sdk_bottom_sheet, viewGroup, false);
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type com.zing.mp3.sdk.view.widgets.SongBtsView");
        return (SongBtsView) inflate;
    }
}

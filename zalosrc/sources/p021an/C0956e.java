package p021an;

import android.content.Intent;
import android.net.Uri;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.List;
import me0.AbstractC23211s7;
import me0.AbstractC23254w8;
import p542ub.InterfaceC27218a;
import s10.InterfaceC26090a;

/* renamed from: an.e */
/* loaded from: classes3.dex */
public final class C0956e implements InterfaceC26090a {

    /* renamed from: a */
    public static final C0956e f3453a = new C0956e();

    private C0956e() {
    }

    @Override // s10.InterfaceC26090a
    /* renamed from: a */
    public Uri mo4497a(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            List m71478a = GalleryPickerView.Companion.m71478a(intent);
            if (m71478a.isEmpty()) {
                return null;
            }
            MediaItem mediaItem = (MediaItem) m71478a.get(0);
            if (mediaItem.mo41081Q().length() == 0) {
                return null;
            }
            if (AbstractC23254w8.m119859g(mediaItem.mo41081Q())) {
                return Uri.parse(mediaItem.mo41081Q());
            }
            return Uri.fromFile(new File(mediaItem.mo41081Q()));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    @Override // s10.InterfaceC26090a
    /* renamed from: b */
    public void mo4498b(InterfaceC27218a interfaceC27218a, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        AbstractC23211s7.m119587t(interfaceC27218a, i11, 30);
    }
}

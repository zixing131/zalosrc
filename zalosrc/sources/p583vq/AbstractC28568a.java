package p583vq;

import android.text.TextUtils;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import fn0.AbstractC19074t;

/* renamed from: vq.a */
/* loaded from: classes4.dex */
public abstract class AbstractC28568a {
    /* renamed from: a */
    public static final CameraInputParams m142995a(MediaItem mediaItem) {
        String mo41083a0;
        AbstractC19074t.m100208f(mediaItem, "photo");
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41133u = 2;
        cameraInputParams.f41137w = mediaItem.mo41081Q();
        if (!TextUtils.isEmpty(mediaItem.m41113N())) {
            mo41083a0 = mediaItem.m41113N();
        } else {
            mo41083a0 = mediaItem.mo41083a0();
        }
        cameraInputParams.f41141y = mo41083a0;
        cameraInputParams.f41083B = mediaItem.m41177y();
        cameraInputParams.f41119l0 = new SendInputParams(2);
        cameraInputParams.f41105X = "6";
        return cameraInputParams;
    }
}

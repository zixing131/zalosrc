package ye0;

import com.zing.zalo.MainApplication;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import ve0.InterfaceC27993b;

/* renamed from: ye0.a */
/* loaded from: classes4.dex */
public final class C30919a implements InterfaceC27993b {

    /* renamed from: a */
    private static final Logger f142588a = Logger.getLogger(C30919a.class.getName());

    @Override // ve0.InterfaceC27993b
    /* renamed from: a */
    public InputStream mo141027a(String str) {
        InputStream inputStream;
        try {
            inputStream = MainApplication.getAppContext().getAssets().open(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            inputStream = null;
        }
        if (inputStream == null) {
            f142588a.log(Level.WARNING, String.format("File %s not found", str));
        }
        return inputStream;
    }
}

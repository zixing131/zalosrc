package p664y;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: y.e */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC30232e extends AsyncTask {

    /* renamed from: a */
    private a f140432a;

    /* renamed from: b */
    protected final b f140433b;

    /* renamed from: y.e$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        void mo149084a(AbstractAsyncTaskC30232e abstractAsyncTaskC30232e);
    }

    /* renamed from: y.e$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        JSONObject mo149085a();

        /* renamed from: b */
        void mo149086b(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC30232e(b bVar) {
        this.f140433b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f140432a;
        if (aVar != null) {
            aVar.mo149084a(this);
        }
    }

    /* renamed from: b */
    public void m149082b(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    /* renamed from: c */
    public void m149083c(a aVar) {
        this.f140432a = aVar;
    }
}

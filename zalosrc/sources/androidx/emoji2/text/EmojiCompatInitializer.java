package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.AbstractC1452r;
import androidx.emoji2.text.C1698f;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1767f;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1944a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p195h2.InterfaceC19715a;

/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements InterfaceC19715a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes2.dex */
    public static class C1690a extends C1698f.c {
        protected C1690a(Context context) {
            super(new C1691b(context));
            m8701e(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes2.dex */
    public static class C1691b implements C1698f.h {

        /* renamed from: a */
        private final Context f6806a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: classes2.dex */
        public class a extends C1698f.i {

            /* renamed from: a */
            final /* synthetic */ C1698f.i f6807a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f6808b;

            a(C1698f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f6807a = iVar;
                this.f6808b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C1698f.i
            /* renamed from: a */
            public void mo8655a(Throwable th2) {
                try {
                    this.f6807a.mo8655a(th2);
                } finally {
                    this.f6808b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C1698f.i
            /* renamed from: b */
            public void mo8656b(C1706n c1706n) {
                try {
                    this.f6807a.mo8656b(c1706n);
                } finally {
                    this.f6808b.shutdown();
                }
            }
        }

        C1691b(Context context) {
            this.f6806a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C1698f.h
        /* renamed from: a */
        public void mo8653a(final C1698f.i iVar) {
            final ThreadPoolExecutor m8659b = AbstractC1695c.m8659b("EmojiCompatInitializer");
            m8659b.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C1691b.this.m8652d(iVar, m8659b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8652d(C1698f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C1703k m8663a = AbstractC1696d.m8663a(this.f6806a);
                if (m8663a != null) {
                    m8663a.m8727g(threadPoolExecutor);
                    m8663a.m8697a().mo8653a(new a(iVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                iVar.mo8655a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes2.dex */
    public static class RunnableC1692c implements Runnable {
        RunnableC1692c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC1452r.m7366a("EmojiCompat.EmojiCompatInitializer.run");
                if (C1698f.m8681g()) {
                    C1698f.m8679c().m8687j();
                }
            } finally {
                AbstractC1452r.m7367b();
            }
        }
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: a */
    public List mo8640a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo8641b(Context context) {
        C1698f.m8680f(new C1690a(context));
        m8643d(context);
        return Boolean.TRUE;
    }

    /* renamed from: d */
    void m8643d(Context context) {
        final AbstractC1785o lifecycle = ((InterfaceC1801w) C1944a.m10736e(context).m10740f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo9335a(new InterfaceC1767f() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: D5 */
            public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9272a(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Ro */
            public void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                EmojiCompatInitializer.this.m8644e();
                lifecycle.mo9338d(this);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Xy */
            public /* synthetic */ void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9273b(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Zv */
            public /* synthetic */ void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9277f(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: mr */
            public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9274c(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: wC */
            public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9276e(this, interfaceC1801w);
            }
        });
    }

    /* renamed from: e */
    void m8644e() {
        AbstractC1695c.m8661d().postDelayed(new RunnableC1692c(), 500L);
    }
}

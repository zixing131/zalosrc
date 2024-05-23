package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.ThreadUtils;

/* loaded from: classes7.dex */
public class ThreadUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1CaughtException {

        /* renamed from: e */
        Exception f118076e;

        C1CaughtException() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1Result {
        public V value;

        C1Result() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.ThreadUtils$2CaughtException, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C2CaughtException {

        /* renamed from: e */
        Exception f118077e;

        C2CaughtException() {
        }
    }

    /* loaded from: classes7.dex */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        Objects.requireNonNull(countDownLatch);
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.b0
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public final void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
        } else {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z11 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.d0
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtils.lambda$invokeAtFrontUninterruptibly$0(ThreadUtils.C1Result.this, callable, c1CaughtException, countDownLatch);
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.f118076e == null) {
            return c1Result.value;
        }
        throw new RuntimeException(c1CaughtException.f118076e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [V, java.lang.Object] */
    public static /* synthetic */ void lambda$invokeAtFrontUninterruptibly$0(C1Result c1Result, Callable callable, C1CaughtException c1CaughtException, CountDownLatch countDownLatch) {
        try {
            c1Result.value = callable.call();
        } catch (Exception e11) {
            c1CaughtException.f118076e = e11;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$invokeAtFrontUninterruptibly$1(Runnable runnable, C2CaughtException c2CaughtException, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } catch (Exception e11) {
            c2CaughtException.f118077e = e11;
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$invokeAtFrontUninterruptibly$2(Runnable runnable) throws Exception {
        runnable.run();
        return null;
    }

    public static void waitUninterruptibly(final Object obj) {
        Objects.requireNonNull(obj);
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.e0
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public final void run() {
                obj.wait();
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        long j12 = j11;
        boolean z12 = false;
        do {
            try {
                z11 = countDownLatch.await(j12, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j12 = j11 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z12 = true;
            }
        } while (j12 > 0);
        if (z12) {
            Thread.currentThread().interrupt();
        }
        return z11;
    }

    public static boolean invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable, long j11) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return true;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        final C2CaughtException c2CaughtException = new C2CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.c0
            @Override // java.lang.Runnable
            public final void run() {
                ThreadUtils.lambda$invokeAtFrontUninterruptibly$1(runnable, c2CaughtException, countDownLatch);
            }
        });
        boolean awaitUninterruptibly = awaitUninterruptibly(countDownLatch, j11);
        if (c2CaughtException.f118077e == null) {
            return awaitUninterruptibly;
        }
        throw new RuntimeException(c2CaughtException.f118077e);
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable() { // from class: org.webrtc.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void lambda$invokeAtFrontUninterruptibly$2;
                lambda$invokeAtFrontUninterruptibly$2 = ThreadUtils.lambda$invokeAtFrontUninterruptibly$2(runnable);
                return lambda$invokeAtFrontUninterruptibly$2;
            }
        });
    }
}

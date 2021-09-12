import org.eclipse.jgit.api.Git
import java.io.File

fun main(args: Array<String>) {

	val remotePath = "https://git.eclipse.org/r/jgit/jgit.git"
	val localPath  = "D:\\Repo\\JGit"

	val git = Git.cloneRepository()
		.setURI(remotePath)
		.setDirectory(File(localPath))
		.setBare(false)
		.call()
	println(git.repository.directory)
}